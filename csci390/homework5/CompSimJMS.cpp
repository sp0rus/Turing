/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: CompSimJMS.cpp
     Current Date: May 4, 2011
     Course Information: CSCI 390 - Section 1
     Instructor: Ms. C. B. Zickos
     Program Description: Program is a software simulation of the "Simpletron" computer.
    
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering,      and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this      programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/ 


/*
 *  CompSim.cpp
 *
 * Starter code for EX08_19.cpp
 *
 *  Date: 4/27/11
 *  Copyright 2011 University of Mississippi Department of Computer Science. All rights reserved.
 *
 */

// starter code based on Dietel and Dietel solution for EX08_19.cpp
// All "trivial" code is included
// The non-trivial code, you will be required to write. Use the prototypes exactly as given here.
// if you wish to start from scratch and write your own version, then that is acceptable as long as
// you use the prototypes exactly as given in this code.


#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

//-------------    CONSTANT DEFINITIONS     ------------------------------//

// define a constant to represent the size of memory (100)
const int SIZE = 100;

// define constants for MIN_WORD & MAX_WORD range of -9999 to 9999.
const int MIN_WORD = -9999;
const int MAX_WORD = 9999;

// define a constant to represent the SENTINEL value of -99999
const long SENTINEL = -99999;

// define constants for each of Simpletron's op codes
enum Commands { READ = 10, WRITE,
	LOAD = 20, STORE,
	ADD = 30, SUBTRACT, DIVIDE, MULTIPLY,
	BRANCH = 40, BRANCHNEG, BRANCHZERO, HALT
};

//-------------      FUNCTION PROTOTYPES     ------------------------------//

// These prototypes must be used exactly as they appear here.

//interactively reads a list of program commands and loads them into the block of memory passed as a parameter
void load ( int * const );

//executes each of the program commands from the block of memory passed to the function.
// also, passes the registers and counters required.
void execute( int * const, int * const, int * const, int * const,
			 int * const, int * const);

//performs a dump of memory, registers and counters.
void dump( const int * const, int, int, int, int, int );

// validates the instruction to be within the range of MIN_WORD and MAX_WORD
bool validWord( int );

// used by dump for formatting purposes
void output( string, int, int, bool );

int main()
{
	//-------------      DEFINITIONS        ------------------------------//

	// define an array to simulate Simpletron's memory
	int memory[ SIZE ] = { 0 };

	// define a variable to simulate a special "register" called
	//  the accumulator in which data is put before processing
	//     (i.e. using in a calculation or examining)
	int accumulator = 0;

	// define a variable to simulate Simpletron's instruction counter.
	int instructionCounter = 0;

	// define a variable to hold the op code portion
	//      of the current program instruction.
	int operationCode = 0;

	// define a variable to hold the operand portion
	//      of the current program instruction.
	int operand = 0;

	// define a variable to simulate Simpletron's instruction register.
	int instructionRegister = 0;

	//-------------      EXECUTION        ------------------------------//

	// Load the program into memory.
	load( memory );

	// Execute the program.
	execute( memory,
            &accumulator,
            &instructionCounter, &instructionRegister,
            &operationCode, &operand
			);

	// Print out name and content of each register and memory.
	dump( memory,
         accumulator,
         instructionCounter, instructionRegister,
         operationCode, operand
		 );

} // end main

//-------------      FUNCTION DEFINITIONS     ------------------------------//

//interactively reads a list of program commands,
//   loading each one into consecutive memory locations
void load( int * const memory )
{
	// define variable of type long to hold instruction entered by user.
	long instruction;

	// define subscript for storing instructions into consecutive memory cells
	// the first instruction is always loaded into location 0
	int location=0;

	// print introductory message "Welcome to Simpletron" , etc
	// prompt & read first instruction
	        cout << "***           Welcome to Simpletron           ***" << endl
	             << "*** Please enter your program one instruction ***" << endl
	             << "*** (or data word) at a time. I will type the ***" << endl
	             << "*** location number and a question mark (?).  ***" << endl
	             << "*** You then type the word for that location. ***" << endl
	             << "*** Type the sentinal -99999 to stop entering ***" << endl
	             << "*** your program.                             ***" << endl;
	        cin >> instruction;

	// repeat while the instruction entered is not the sentinel value
	while (instruction != SENTINEL)
	{
		// if the instruction is valid
		if (  /*TODO*/ )
		{
		        // assign the instruction to the memory[location]
			    /*TODO*/
			   // increment the index variable location
			   /*TODO*/
		}
		else
		{
		       // print error message "Number out of range. Please enter again.\n";
		      /*TODO*/
		}
		// prompt & read the next instruction
		/*TODO*/
	}

} // end load

//executes each of the program commands
void execute( int * const memory, int * const acPtr, int * const icPtr,
			 int * const irPtr, int * const opCodePtr, int * const opPtr )
{
	// define a variable to be used as a flag for a fatal error
	/*TODO*/

	// define an integer variable to be used as a temporary memory cell for certain
	//    operations such as a READ
	/*TODO*/

	// print an introductory message of STARTING SIMPLETRON EXECUTION
	/*TODO*/

	// repeat this loop until a HALT is read or a fatal error occurs
	do
	{
		// move the instruction from memory into the instruction register
		*irPtr= /*TODO*/

		// extract the op code portion of the instruction
		*opCodePtr = /*TODO*/

		// extract the operand portion
		*opPtr = /*TODO*/

		// run the op code through a switch to take appropriate action
		switch ( *opCodePtr )
		{
			case READ:
				// prompt & read an integer & store in variable temp
				/*TODO*/
				while (!validWord(temp) )
				{
					  // prompt & read again
					  /*TODO*/
				}
				// store  temp into memory
				memory[*opPtr] = /*TODO*/;

				// increment the instruction counter
				++(*icPtr);
			        break;

			case WRITE:
				// output the contents of the operand location from *opPtr, and the operand from memory[*opPtr]
				/*TODO*/
				// increment the instruction counter
				/*TODO*/
        			break;

			// case of LOAD instruction
			/*TODO*/
				// store the operand from memory into the accumulator
				*acPtr = /*TODO*/
				// increment the instruction counter
				/*TODO*/
			        break;

		        // case of a STORE instruction
		        /*TODO*/
				// store the accumulator into the operand's memory location. (Opposite of LOAD)
				/*TODO*/
				// increment the instruction counter
				/*TODO*/
			        break;

		        //case of ADD
				// add the accumulator to the operand in memory and store in temp
				temp = memory[*opPtr] + /*TODO*/;

				// if the result in temp is valid
				if (validWord(temp)
				{
					// store temp in accumulator
					/*TODO*/
					// increment the instruction counter
                                        /*TODO*/
				}
				else
				{
					// print fatal error message of
					// Accumulator overflow, Simpletron execution abnormally terminated
					/*TODO*/
					//set fatal flag to true
					/*TODO*/
				}
				        break;

				//case of SUBTRACT
				/*TODO*/
					// subtract the operand in memory from the accumlator and store in temp
					temp = /*TODO*/
					// check to see if temp is a valid word
					if (validWord(temp)
					{
						// store temp to the accumulator
						/*TODO*/
						// increment the instruction counter
						/*TODO*/
					}
					else
					{
		        			//print fatal error message of Accumulator overflow
						// and Simpletron execution abnormally terminated
						/*TODO*/
						//set fatal flag
	    				        /*TODO*/
					}
				        break;

				//case of DIVIDE
			        /*TODO*/
					// check if operand is 0
					if ( memory[ *opPtr ] == 0 )
					{
						//print fatal error message of Attempt to divide by zero 
		     			        // and Simpletron execution abnormally terminated
					        /*TODO*/
						// set fatal flag
					        /*TODO*/
					}
					else
					{
						// divide the accumulator by the operand and store back into the accum.
						*acPtr /= /*TODO*/   // OR *acPtr = *acPtr / /*TODO*/
						// increment the instruction counter
						/*TODO*/
					}
					break;

				//case of MULTIPLY
				/*TODO*/
					// multiply the accumulator by the operand and store in temp
					temp = /*TODO*/
					// check to see if temp is valid
					if (validWord(temp)
					{
						// store temp in the accumulator
						*acPtr = /*TODO*/
						// increment the instruction counter
						/*TODO*/
					}
					else
					{
					        // print error message of Accumulator overflow
						//  and Simpletron execution abnormally terminate
						/*TODO*/
						// set fatal flag
						/*TODO*/
					}
					break;

				case BRANCH:
					*icPtr = *opPtr;
					break;

				case BRANCHNEG:
					*acPtr < 0 ? *icPtr = *opPtr : ++( *icPtr );
					break;

				case BRANCHZERO:
	       				*acPtr == 0 ? *icPtr = *opPtr : ++( *icPtr );
					break;

				case HALT:
					// print message of Simpletron execution terminated
					/*TODO*/
					break;

				default:
			        	// print error message of Invalid Operand
					/*TODO*/
					// set fatal flag
					/*TODO*/
					break;
		} // end switch

	 } while ( *opCodePtr != HALT && !fatal );
        	// print conclusionary message of END SIMPLETRON EXECUTION
	        /*TODO*/

} // end function execute

// prints out name and contents of each register and memory
void dump( const int * const memory, int accumulator,
		  int instructionCounter, int instructionRegister, 
		  int operationCode, int operand )
{
	 cout << "\nREGISTERS:\n";
 	 output( "accumulator", 5, accumulator, true );
	 output( "instructionCounter", 2, instructionCounter, false );
	 output( "instructionRegister", 5, instructionRegister, true );
	 output( "operationCode", 2, operationCode, false );
	 output( "operand", 2, operand, false );
	 cout << "\n\nMEMORY:\n";

	 cout << setfill( ' ' ) << setw( 3 ) << ' ';

	 // print header
	 for ( int i = 0; i <= 9; ++i )
		cout << setw( 5 ) << i << ' ';

	 for ( int i = 0; i < SIZE; ++i )
	 {
		if ( i % 10 == 0 )
			cout << '\n' << setw( 2 ) << i << ' ';

		cout << internal << setw( 5 ) << setfill( '0' ) << memory[ i ] << ' ' << internal;
	 } // end for

	 cout << endl;
} // end function dump

// validate instruction
bool validWord( int word )
{
	 return word >= MIN_WORD && word <= MAX_WORD;
} // end function validWord

// display result
void output( string label, int width, int value, bool sign )
{
	 // format of "accumulator", etc.
	 cout << setfill( ' ' ) << left << setw( 20 ) << label << ' ';

	 // is a +/- sign needed?
	 if ( sign )
		cout << showpos << internal;

	 // setup for displaying accumulator value, etc.
	 cout << left << setfill( '0' );

	 // determine the field widths and display value
	 if ( width == 5 )
		cout << setw( width ) << value << '\n';
	 else  // width is 2
		cout << setfill( ' ' ) << setw( 3 ) << ' ' << setw( width ) << setfill( '0' ) << value << '\n';

	 // disable sign if it was set
	 if ( sign )
		cout << showpos << internal;
} // end function output
