import java.io.*;
///dry run till step 32
public class solution {

	public static void printSubsets(int input[])
	{
      printSubsets(input,0,new int[0]);
	}
    //finop is 1D arr that stores the very next subset
    ///2.printSubsets(input={15,20,12},stindex=0,finop[0])
    ///4.printSubsets(input={15,20,12},stindex=1,finop[0])20.call this
    ///6.printSubsets(input={15,20,12},stindex=2,finop[0])19. nothing returned call finished
    ///8.printSubsets(input={15,20,12},stindex=3,finop[0])10.control returned
    ///15.(6.)printSubsets(input={15,20,12},stindex=3,finop={12})17.control returned
    ///24.(4.)printSubsets(input={15,20,12},stindex=2,finop={20})
   ///26.(4.)printSubsets(input={15,20,12},stindex=3,finop={20})28.control returned

  	public static void printSubsets(int input[],int stindex,int finop[]) {

        //BASE CASE
       ///9.(on screen) nextline then return control
       ///16.(6.)(on screen) nextline,12 ,return control
       ///27.(4.)(on screen) nextline,20 ,return control
      if(stindex==input.length)
      {
        System.out.println("");
        for(int x:finop)
        {
       	 System.out.print(x+" ");

        }
        return;
      }


        //case1.when not printing first int
    ///3.printSubsets(input={15,20,12},stindex=1,finop[0])
    ///5.printSubsets(input={15,20,12},stindex=2,finop[0])
    ///7.printSubsets(input={15,20,12},stindex=3,finop[0])11.control returned
    ///25.(4.)printSubsets(input={15,20,12},stindex=3,finop={20})
     printSubsets(input,stindex+1,finop);//RECURSIVE CALL
    ///12.(6.)lastop[1]
    ///21.(4.)lastop[1]
    ///29.(24.(4.))lastop[2]
      int lastop[]=new int[finop.length+1];

        for(int i=0;i<lastop.length-1;i++)
        {
            ///30.(24.(4.)lastop[0]=20
          lastop[i]=finop[i];
        }
        ///13.(6.)lastop[0]=12
        ///22.(4.)lastop[0]=20
        ///31.(24.(4.)lastop[1]=12
      lastop[lastop.length-1]=input[stindex];

     //case2.when printing first int
     ///14.(6.)printSubsets(input={15,20,12},stindex=3,lastop={12})18.control returned
     ///23.(4.)printSubsets(input={15,20,12},stindex=2,lastop={20})
     ///32.(24.(4.))printSubsets(input={15,20,12},stindex=3,lastop={20,12})
     printSubsets(input,stindex+1,lastop);//RECURSIVE CALL

    }

}
