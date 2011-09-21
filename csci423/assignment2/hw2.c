/*
 * Terminal interaction string processing
 * is shown in this third example.
 */
#include <stdio.h>  // Defines printf() and other fxxxxx() I/O services
#include <stdlib.h> // Defines exit() and other library support routines
#include <unistd.h> // Defines exec() family of services
#include <ctype.h>  // Defines isxxxx() family of services
#include <string.h> // Defines strxxx() family of services

#define TRUE  1
#define FALSE 0

char command[255];

main(int argc, char *argv[], char *envp[])
{
  register char **p;

  int count, pid, status;
  char *cp, *prog, *cmdptr, *arg1;
  char command[255];
  char *args[255];
  int argcount = 0;

  if(fork() == FALSE)           // Child code - Concise version: if (!fork())
  {
    printf("Yes master? ");
    fgets(command, 255, stdin);
    // fgets() reads in the newline and stores it into the "command" buffer.
    // Also, null ('\0') character is placed after the last character in the buffer.
    count = strlen(command);
    printf("String length: %d\n", count);
    cp = command;                // Initialize working pointer
    prog = cp;                   // Assume 1st char in command buffer is program name
    while(!isspace(*cp)) cp++;   // Skip over program name until white space found
    if(*cp == '\n') goto error;  // Reached end of string too soon, no argument
    *cp++ = (char)0;             // Terminate string and skip to next char in string
    printf("ProgName: %s\n", prog);
    while(*cp != NULL){
        args[argcount] = cp;
        while(!isspace(*cp)) cp++;
        *cp = (char)0;
        cp++;
  	printf("Arg%d: %s\n", argcount+1, args[argcount]);
        argcount++;
    }
    args[argcount] = NULL;
    // A loop is needed here to capture all arguments until end of command buffer found.
    // See "man strtok" for another (easier) way of doing string processing.
    printf("Reached end of string\n");
    printf("Ready to exec\n");
    fflush(stdout);
    if(execv(prog, args))
    {
      // -1 return means error
      printf("Exec service failed\n");
      fflush(stdout);
error:
      printf("Cannot find file\n");
      fflush(stdout);
      exit(123);
    } // End of if(exec)
  } else
  {  // Parent code
    pid = wait(&status);         // Will the parent hang if the child has an error?
    printf("How child terminated = %d, Child return code = %d, PID = %d\n",
      ((status & 0xff00) >> 8), (status & 0xff), pid);
  } // End of fork
}  // End of main
