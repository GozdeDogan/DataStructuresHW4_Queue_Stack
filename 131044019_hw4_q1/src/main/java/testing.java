import javax.swing.text.html.parser.Parser;
import java.io.*;
import java.util.DoubleSummaryStatistics;
import java.util.StringTokenizer;

/**
 * Created by GozdeDogan on 19.03.2017.
 */
public class testing {

    public static void main(String[] args){

        String fileName = new String("test.csv");
        String outFile = new String("testResults_1.csv");

        StackA<Integer> stackAInt = new StackA<Integer>();
        StackA<Double> stackADouble = new StackA<Double>();
        StackA<Character> stackAChar = new StackA<Character>();
        StackA<String> stackAStr = new StackA<String>();
        readFileStackA(fileName, stackAInt, stackADouble, stackAChar, stackAStr);

        StackB<Integer> stackBInt = new StackB<Integer>();
        StackB<Double> stackBDouble = new StackB<Double>();
        StackB<Character> stackBChar = new StackB<Character>();
        StackB<String> stackBStr = new StackB<String>();
        readFileStackB(fileName, stackBInt, stackBDouble, stackBChar, stackBStr);

        StackC<Integer> stackCInt = new StackC<Integer>();
        StackC<Double> stackCDouble = new StackC<Double>();
        StackC<Character> stackCChar = new StackC<Character>();
        StackC<String> stackCStr = new StackC<String>();
        readFileStackC(fileName, stackCInt, stackCDouble, stackCChar, stackCStr);

        StackD<Integer> stackDInt = new StackD<Integer>();
        StackD<Double> stackDDouble = new StackD<Double>();
        StackD<Character> stackDChar = new StackD<Character>();
        StackD<String> stackDStr = new StackD<String>();
        readFileStackD(fileName, stackDInt, stackDDouble, stackDChar, stackDStr);

        printFile(outFile, stackAInt, stackADouble, stackAChar, stackAStr, stackBInt, stackBDouble, stackBChar, stackBStr,
                stackCInt, stackCDouble, stackCChar, stackCStr, stackDInt, stackDDouble, stackDChar, stackDStr);

    }

    private static void readFileStackA(String fileName, StackA<Integer> stackInt, StackA<Double> stackDouble, StackA<Character> stackChar, StackA<String> stackStr){
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String temp = null;
            line = bufferedReader.readLine();
            StringTokenizer tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                 temp = (String)tok.nextElement();
                stackInt.push(Integer.parseInt(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackDouble.push(Double.parseDouble(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackChar.push(temp.charAt(0));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackStr.push(temp);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    private static void readFileStackB(String fileName, StackB<Integer> stackInt, StackB<Double> stackDouble, StackB<Character> stackChar, StackB<String> stackStr){
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String temp = null;
            line = bufferedReader.readLine();
            StringTokenizer tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackInt.push(Integer.parseInt(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackDouble.push(Double.parseDouble(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackChar.push(temp.charAt(0));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackStr.push(temp);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    private static void readFileStackC(String fileName, StackC<Integer> stackInt, StackC<Double> stackDouble, StackC<Character> stackChar, StackC<String> stackStr){
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String temp = null;
            line = bufferedReader.readLine();
            StringTokenizer tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackInt.push(Integer.parseInt(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackDouble.push(Double.parseDouble(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackChar.push(temp.charAt(0));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackStr.push(temp);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    private static void readFileStackD(String fileName, StackD<Integer> stackInt, StackD<Double> stackDouble, StackD<Character> stackChar, StackD<String> stackStr){
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String temp = null;
            line = bufferedReader.readLine();
            StringTokenizer tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackInt.push(Integer.parseInt(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackDouble.push(Double.parseDouble(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackChar.push(temp.charAt(0));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                stackStr.push(temp);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    private static void printFile(String outFile, StackA<Integer> stackAInt, StackA<Double> stackADouble,
                                  StackA<Character> stackAChar,  StackA<String> stackAStr, StackB<Integer> stackBInt,
                                  StackB<Double> stackBDouble, StackB<Character> stackBChar, StackB<String> stackBStr,
                                  StackC<Integer> stackCInt, StackC<Double> stackCDouble, StackC<Character> stackCChar,
                                  StackC<String> stackCStr, StackD<Integer> stackDInt, StackD<Double> stackDDouble,
                                  StackD<Character> stackDChar, StackD<String> stackDStr){

        BufferedWriter output = null;
        try {
            File file = new File(outFile);
            output = new BufferedWriter(new FileWriter(file));
            String size;
            //output.write("StackA ->>\n");
            size = new String();
            size += stackAInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackAInt.toString());
            output.write("\n");
            size = new String();
            size += stackADouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackADouble.toString());
            output.write("\n");
            size = new String();
            size += stackAChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackAChar.toString());
            output.write("\n");
            size = new String();
            size += stackAStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackAStr.toString());
            output.write("\n");

            //output.write("\nStackB ->>\n");
            size = new String();
            size += stackBInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackBInt.toString());
            output.write("\n");
            size = new String();
            size += stackBDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackBDouble.toString());
            output.write("\n");
            size = new String();
            size += stackBChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackBChar.toString());
            output.write("\n");
            size = new String();
            size += stackBStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackBStr.toString());
            output.write("\n");

            //output.write("\nStackC ->>\n");
            size = new String();
            size += stackCInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackCInt.toString());
            output.write("\n");
            size = new String();
            size += stackCDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackCDouble.toString());
            output.write("\n");
            size = new String();
            size += stackCChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackCChar.toString());
            output.write("\n");
            size = new String();
            size += stackCStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackCStr.toString());
            output.write("\n");

            //output.write("\nStackD ->>\n");
            size = new String();
            size += stackDInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackDInt.toString());
            output.write("\n");
            size = new String();
            size += stackDDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackDDouble.toString());
            output.write("\n");
            size = new String();
            size += stackDChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackDChar.toString());
            output.write("\n");
            size = new String();
            size += stackDStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(stackDStr.toString());
            output.write("\n");

            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}
