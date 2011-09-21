// C99 Syntax Compliant
 
#include <stdio.h> // Stops the message: "warning: incompatible implicit declaration of built-in function printf"

main(int argc, char *argv[], char *envp[]) // Stops the message: warning: assignment makes pointer from integer without a cast
{
  char **p;

  for (p = argv; *p ; p++)
  {
    printf ("%s\n", *p);
  }
}
