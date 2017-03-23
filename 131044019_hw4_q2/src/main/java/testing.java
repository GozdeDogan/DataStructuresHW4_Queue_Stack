import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Created by GozdeDogan on 20.03.2017.
 */
public class testing {

    public static void main(String[] args){
        String fileName = new String("test.csv");
        String outFile = new String("testResults_2.csv");

        myQueue<Integer> queueInt = new myQueue<Integer>();
        myQueue<Double> queueDouble = new myQueue<Double>();
        myQueue<Character> queueChar = new myQueue<Character>();
        myQueue<String> queueStr = new myQueue<String>();

        Queue<Integer> qInt = new LinkedList<Integer>();
        Queue<Double> qDouble = new LinkedList<Double>();
        Queue<Character> qChar = new LinkedList<Character>();
        Queue<String> qStr = new LinkedList<String>();

        readFileQueue(fileName, queueInt, queueDouble, queueChar, queueStr, qInt, qDouble, qChar, qStr);

        printFile(outFile, queueInt, queueDouble, queueChar, queueStr, qInt, qDouble, qChar, qStr);
    }

    private static void readFileQueue(String fileName, myQueue<Integer> queueInt, myQueue<Double> queueDouble,
                                      myQueue<Character> queueChar, myQueue<String> queueStr, Queue<Integer> qInt,
                                      Queue<Double> qDouble, Queue<Character> qChar, Queue<String> qStr){
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
                queueInt.offer(Integer.parseInt(temp));
                qInt.offer(Integer.parseInt(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                queueDouble.offer(Double.parseDouble(temp));
                qDouble.offer(Double.parseDouble(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                queueChar.offer(temp.charAt(0));
                qChar.offer(temp.charAt(0));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                queueStr.offer(temp);
                qStr.offer(temp);
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

    private static void printFile(String outFile, myQueue<Integer> queueInt, myQueue<Double> queueDouble,
                                  myQueue<Character> queueChar,  myQueue<String> queueStr, Queue<Integer> qInt,
                                  Queue<Double> qDouble, Queue<Character> qChar, Queue<String> qStr){

        BufferedWriter output = null;
        try {
            File file = new File(outFile);
            output = new BufferedWriter(new FileWriter(file));
            String size;

            output.write("myQueue ->>\n");
            size = new String();
            size += queueStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueStr.toString());
            output.write("\n");
            size = new String();
            size += queueChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueChar.toString());
            output.write("\n");
            size = new String();
            size += queueDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueDouble.toString());
            output.write("\n");
            size = new String();
            size += queueInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueInt.toString());
            output.write("\n");

            ///////////////////reverseToString
            output.write("\nreverse myQueue->>\n");
            size = new String();
            size += queueStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueStr.reverseToString());
            output.write("\n");
            size = new String();
            size += queueChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueChar.reverseToString());
            output.write("\n");
            size = new String();
            size += queueDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueDouble.reverseToString());
            output.write("\n");
            size = new String();
            size += queueInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueInt.reverseToString());
            output.write("\n");


            ///////////////////Queue
            output.write("\n\nQueue ->>\n");
            size = new String();
            size += qStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueStr.toStringQueue(qStr));
            output.write("\n");
            size = new String();
            size += qChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueChar.toStringQueue(qChar));
            output.write("\n");
            size = new String();
            size += qDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueDouble.toStringQueue(qDouble));
            output.write("\n");
            size = new String();
            size += qInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueInt.toStringQueue(qInt));
            output.write("\n");

            ///////////////////reverseToString
            output.write("\nreverse Queue->>\n");
            size = new String();
            size += qStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueStr.toStringReverseQueue(qStr));
            output.write("\n");
            size = new String();
            size += qChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueChar.toStringReverseQueue(qChar));
            output.write("\n");
            size = new String();
            size += qDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueDouble.toStringReverseQueue(qDouble));
            output.write("\n");
            size = new String();
            size += qInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueInt.toStringReverseQueue(qInt));
            output.write("\n");


            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}
