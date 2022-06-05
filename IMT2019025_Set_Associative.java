import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;  
import java.util.ArrayList;

public class IMT2019025_Set_Associative
{
    public static void main(String[] args)
    {
        Set_Associative sa = new Set_Associative(16384);    //Creating a Set_Associative. object which takes 16384 as parameter which is the index.
        int hit = 0;    //Variables to count hit,miss and total count.
        int miss = 0;
        int total = 0;
        try 
        {
            File file = new File("gcc.trace");      //Taking the input from gcc.trace file. For that Creating a File object.
            Scanner file_reader = new Scanner(file);    //Creating a Scanner object to read the file.
            while (file_reader.hasNextLine())   //Iterating a loop until we reach the end of the file.
            {
                String data = file_reader.nextLine();   //Reading the line from the file.
                total += 1;     //Incrementing the value of total as we read a input.
                String addr = data.substring(4,12);     //Extracting the hexadecimal value in the input
                String binary = HextoBinary(addr);      //Converting the value of the hexadecimal to binary.        
                if(sa.check(binary))    //Checking whether it is hit or miss and incrementing respective variable
                {
                    hit += 1;
                }
                else
                {                    
                    miss += 1;
                }
            }
            file_reader.close();    //Closing the file.
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        double hit_rate = (double)hit/(double)total;    //Calculating the hit_rate.
        double miss_rate = (double)miss/(double)total;  //Calculating the miss_rate.
        double hit_miss_rate = (double)hit/(double)miss;    //Calculating the hit to miss rate.

        System.out.println("Trace : gcc.trace");    //Printing the values.
        System.out.println("Total count : " + total);
        System.out.println("Hit : " + hit);
        System.out.println("Miss : " + miss);
        System.out.println("Hit Rate : " + String.format("%.6f",hit_rate));
        System.out.println("Miss Rate : " + String.format("%.6f",miss_rate));
        System.out.println("Hit to Miss rate : " + String.format("%.6f",hit_miss_rate));
        System.out.println();

        total = 0;  //resetting the total,hit,miss variables.
        hit = 0;
        miss = 0;
        sa.reset(); //resetting the Set_Associative cache.
        try 
        {
            File file = new File("gzip.trace"); //Taking the input from gzip.trace file. For that Creating a File object.
            Scanner file_reader = new Scanner(file);    //Creating a Scanner object to read the file.
            while (file_reader.hasNextLine())   //Iterating a loop until we reach the end of the file.
            {
                String data = file_reader.nextLine();   //Reading the line from the file.
                total += 1;     //Incrementing the value of total as we read a input.
                String addr = data.substring(4,12);     //Extracting the hexadecimal value in the input
                String binary = HextoBinary(addr);      //Converting the value of the hexadecimal to binary.        
                if(sa.check(binary))    //Checking whether it is hit or miss and incrementing respective variable
                {
                    hit += 1;
                }
                else
                {                    
                    miss += 1;
                }
            }
            file_reader.close();    //Closing the file.
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        hit_rate = (double)hit/(double)total;   //Calculating the hit_rate.
        miss_rate = (double)miss/(double)total; //Calculating the miss_rate
        hit_miss_rate = (double)hit/(double)miss;   //Calculating the hit to miss rate.

        System.out.println("Trace : gzip.trace"); //Printing the values.
        System.out.println("Total count : " + total);
        System.out.println("Hit : " + hit);
        System.out.println("Miss : " + miss);
        System.out.println("Hit Rate : " + String.format("%.6f",hit_rate));
        System.out.println("Miss Rate : " + String.format("%.6f",miss_rate));
        System.out.println("Hit to Miss rate : " + String.format("%.6f",hit_miss_rate));
        System.out.println();

        total = 0;  //resetting the total,hit,miss variables.
        hit = 0;
        miss = 0;
        sa.reset(); //resetting the Set_Associative cache.
        try 
        {
            File file = new File("mcf.trace");  //Taking the input from mcf.trace file. For that Creating a File object.
            Scanner file_reader = new Scanner(file);    //Creating a Scanner object to read the file.
            while (file_reader.hasNextLine())   //Iterating a loop until we reach the end of the file.
            {
                String data = file_reader.nextLine();   //Reading the line from the file.
                total += 1;     //Incrementing the value of total as we read a input.
                String addr = data.substring(4,12);     //Extracting the hexadecimal value in the input
                String binary = HextoBinary(addr);      //Converting the value of the hexadecimal to binary.        
                if(sa.check(binary))    //Checking whether it is hit or miss and incrementing respective variable
                {
                    hit += 1;
                }
                else
                {                    
                    miss += 1;
                }
            }
            file_reader.close();    //Closing the file.
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        hit_rate = (double)hit/(double)total;   //Calculating the hit_rate.
        miss_rate = (double)miss/(double)total; //Calculating the miss_rate
        hit_miss_rate = (double)hit/(double)miss;   //Calculating the hit to miss rate.

        System.out.println("Trace : mcf.trace");    //Printing the values.
        System.out.println("Total count : " + total);
        System.out.println("Hit : " + hit);
        System.out.println("Miss : " + miss);
        System.out.println("Hit Rate : " + String.format("%.6f",hit_rate));
        System.out.println("Miss Rate : " + String.format("%.6f",miss_rate));
        System.out.println("Hit to Miss rate : " + String.format("%.6f",hit_miss_rate));
        System.out.println();
    
        total = 0;  //resetting the total,hit,miss variables.
        hit = 0;
        miss = 0;
        sa.reset(); //resetting the Set_Associative cache.
        try 
        {
            File file = new File("swim.trace");     //Taking the input from swim.trace file. For that Creating a File object.
            Scanner file_reader = new Scanner(file);    //Creating a Scanner object to read the file.
            while (file_reader.hasNextLine())   //Iterating a loop until we reach the end of the file.
            {
                String data = file_reader.nextLine();   //Reading the line from the file.
                total += 1;     //Incrementing the value of total as we read a input.
                String addr = data.substring(4,12);     //Extracting the hexadecimal value in the input
                String binary = HextoBinary(addr);      //Converting the value of the hexadecimal to binary.        
                if(sa.check(binary))    //Checking whether it is hit or miss and incrementing respective variable
                {
                    hit += 1;
                }
                else
                {                    
                    miss += 1;
                }
            }
            file_reader.close();    //Closing the file.
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        hit_rate = (double)hit/(double)total;   //Calculating the hit_rate.
        miss_rate = (double)miss/(double)total; //Calculating the miss_rate
        hit_miss_rate = (double)hit/(double)miss;   //Calculating the hit to miss rate.

        System.out.println("Trace : swim.trace");   //Printing the values.
        System.out.println("Total count : " + total);
        System.out.println("Hit : " + hit);
        System.out.println("Miss : " + miss);
        System.out.println("Hit Rate : " + String.format("%.6f",hit_rate));
        System.out.println("Miss Rate : " + String.format("%.6f",miss_rate));
        System.out.println("Hit to Miss rate : " + String.format("%.6f",hit_miss_rate));
        System.out.println();

        total = 0;  //resetting the total,hit,miss variables.
        hit = 0;
        miss = 0;
        sa.reset(); //resetting the Set_Associative cache.
        try 
        {
            File file = new File("twolf.trace");    //Taking the input from twolf.trace file. For that Creating a File object.
            Scanner file_reader = new Scanner(file);    //Creating a Scanner object to read the file.
            while (file_reader.hasNextLine())   //Iterating a loop until we reach the end of the file.
            {
                String data = file_reader.nextLine();   //Reading the line from the file.
                total += 1;     //Incrementing the value of total as we read a input.
                String addr = data.substring(4,12);     //Extracting the hexadecimal value in the input
                String binary = HextoBinary(addr);      //Converting the value of the hexadecimal to binary.        
                if(sa.check(binary))    //Checking whether it is hit or miss and incrementing respective variable
                {
                    hit += 1;
                }
                else
                {                    
                    miss += 1;
                }
            }
            file_reader.close();    //Closing the file.
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        hit_rate = (double)hit/(double)total;   //Calculating the hit_rate.
        miss_rate = (double)miss/(double)total; //Calculating the miss_rate
        hit_miss_rate = (double)hit/(double)miss;   //Calculating the hit to miss rate.

        System.out.println("Trace : twolf.trace");  //Printing the values.
        System.out.println("Total count : " + total);
        System.out.println("Hit : " + hit);
        System.out.println("Miss : " + miss);
        System.out.println("Hit Rate : " + String.format("%.6f",hit_rate));
        System.out.println("Miss Rate : " + String.format("%.6f",miss_rate));
        System.out.println("Hit to Miss rate : " + String.format("%.6f",hit_miss_rate));

    }
    private static String HextoBinary(String hex)   //A method to convert Hexadecimal to binary.
    {
        String bin = "";
        int i = 0;
        int len = hex.length();
        while (i<len) 
        {
            switch (hex.charAt(i)) 
            {
                case '0':
                    bin = bin + "0000";
                    break;
                case '1':
                    bin = bin + "0001";
                    break;
                case '2':
                    bin = bin + "0010";
                    break;
                case '3':
                    bin = bin + "0011";
                    break;
                case '4':
                    bin = bin + "0100";
                    break;
                case '5':
                    bin = bin + "0101";
                    break;
                case '6':
                    bin = bin + "0110";
                    break;
                case '7':
                    bin = bin + "0111";
                    break;
                case '8':
                    bin = bin + "1000";
                    break;
                case '9':
                    bin = bin + "1001";
                    break;
                case 'a':
                    bin = bin + "1010";
                    break;
                case 'b':
                    bin = bin + "1011";
                    break;
                case 'c':
                    bin = bin + "1100";
                    break;
                case 'd':
                    bin = bin + "1101";
                    break;
                case 'e':
                    bin = bin + "1110";
                    break;
                case 'f':
                    bin = bin + "1111";
                    break;
            }
            i++;
        }
        return bin;
    }
}

class Set_Associative       //Defining the Set_Associative class
{
    Set_Associative(int index)  //Constructor.
    {
        this.index = index;
        ways = new ArrayList<Ways>();   //Allocating memory for ways arraylist and rank 2D array.
        rank = new int[index][4];
        for(int i=0;i<4;i++)    //Creating the ways objects and storing them in the arraylist.
        {
            Ways way = new Ways(index);
            ways.add(way);
        }
        for(int i=0;i<index;i++)    //Initiating all the elements of the rank 2D array to -1.
        {
            for(int j=0;j<4;j++)
            {
                rank[i][j] = -1;
            }
        }
    }

    public void reset() //A method to reset the cache.
    {
        for(Ways w : ways)
        {
            w.reset();
        }
        for(int i=0;i<index;i++)
        {
            for(int j=0;j<4;j++)
            {
                rank[i][j] = -1;
            }
        }
    }

    public boolean check(String address)    //Check method which checks the tag at the index in all the ways and returns whether it is a hit or a miss. And handles the miss.
    {
        String t = address.substring(0,16); //Extracting the tag and the index of the address.
        String idx = address.substring(16,30);
        int x = binaryToDecimal(idx);
        for(int i=0;i<4;i++)    //Checking the tag in every way and checking whether it is hit or miss. Updating the ranks of those ways.
        {
            if(ways.get(i).check(t,x))
            {
                for(int j=0;j<4;j++)
                {
                    if((rank[x][j] < rank[x][i]) && (rank[x][j] != -1))
                    {
                        rank[x][j]++;
                    }
                }
                rank[x][i] = 0;
                return true;
            }
        }
        for(int i=0;i<4;i++)    //Handling the case when there is a way which is empty(initial condition).
        {
            if(rank[x][i] == -1)    //Checking the first way which is null and setting the tag there.
            {
                ways.get(i).set_tag(t,x);
                for(int j=0;j<4;j++)    //Updating the ranks accordingly.
                {
                    if((rank[x][j] != -1))
                    {
                        rank[x][j]++;
                    }
                }
                rank[x][i] = 0;
                return false;
            }
        }
        for(int i=0;i<4;i++)    //Handling the miss.
        {
            if(rank[x][i] == 3) //Evicting the way which is last accessed(more rank).
            {
                ways.get(i).set_tag(t,x);
                rank[x][i] = 0;
                continue;
            }
            rank[x][i]++;
        } 
        return false;
    }
    private int binaryToDecimal(String n)   //A method which converts the binary to Decimal.
    {
        String num = n;
        int dec_value = 0;
        int base = 1;
        int len = num.length();
        for (int i = len - 1; i >= 0; i--)
        {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
        return dec_value;
    }

    private ArrayList<Ways> ways;
    private int[][] rank;
    private int index;
}


class Ways  //A class ways which has the information of each way like tag, valid bits etc.,
{
    Ways(int index) //Constructor.
    {
        this.index = index;
        valid = new int[index];
        tag = new String[index];
        for(int i=0;i<index;i++)
        {
            valid[i] = 0;
            tag[i] = "";
        }
    }
    public boolean check(String t, int i)   //Check method which check whether the valid is 1 or not. And checks whether the tag matches or not.
    {
        if(valid[i] != 0)
        {
            if(tag[i].equals(t))
            {
                return true;
            }
        }
        return false;
    }

    public void set_tag(String str, int i)  //A method which sets the given tag at the given index.
    {
        this.tag[i] = str;
        valid[i] = 1;
    }

    public void reset() //A method which resets the way.
    {
        for(int i=0;i<index;i++)
        {
            valid[i] = 0;
            tag[i] = "";
        }
    }

    private int index;
    private String[] tag;
    private int[] valid;
}
