import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by GozdeDogan on 21.03.2017.
 */
public class testing {
    public static void main(String[] args){
        String fileName = new String("test.csv");
        String outFile = new String("testResults_3.csv");

        PriorityQueueA<Integer> queueAInt = new PriorityQueueA<Integer>();
        PriorityQueueA<Double> queueADouble = new PriorityQueueA<Double>();
        PriorityQueueA<Character> queueAChar = new PriorityQueueA<Character>();
        PriorityQueueA<String> queueAStr = new PriorityQueueA<String>();

        PriorityQueueB<Integer> queueBInt = new PriorityQueueB<Integer>();
        PriorityQueueB<Double> queueBDouble = new PriorityQueueB<Double>();
        PriorityQueueB<Character> queueBChar = new PriorityQueueB<Character>();
        PriorityQueueB<String> queueBStr = new PriorityQueueB<String>();

        readFileQueue(fileName, queueAInt, queueADouble, queueAChar, queueAStr, queueBInt, queueBDouble, queueBChar, queueBStr);

        printFile(outFile, queueAInt, queueADouble, queueAChar, queueAStr, queueBInt, queueBDouble, queueBChar, queueBStr);


        System.out.println("deleteMin testing------>>>>");
        System.out.println("\nFor Integer -->>");
        System.out.println("\nqueueAInt -> ");
        System.out.println("BEFORE delete -> " + queueAInt.toString());
        queueAInt.deleteMin();
        System.out.println("AFTER delete -> " + queueAInt.toString());

        System.out.println("\nqueueBInt->");
        System.out.println("BEFORE delete -> " + queueBInt.toString());
        queueBInt.deleteMin();
        System.out.println("AFTER delete -> " + queueBInt.toString());

        System.out.println("\n\nFor Double -->>");
        System.out.println("\nqueueADouble->");
        System.out.println("BEFORE delete -> " + queueADouble.toString());
        queueADouble.deleteMin();
        System.out.println("AFTER delete -> " + queueADouble.toString());

        System.out.println("\nqueueBDouble->");
        System.out.println("BEFORE delete -> " + queueBDouble.toString());
        queueBDouble.deleteMin();
        System.out.println("AFTER delete -> " + queueBDouble.toString());

        System.out.println("\n\nFor Character -->>");
        System.out.println("\nqueueAChar->");
        System.out.println("BEFORE delete -> " + queueAChar.toString());
        queueAChar.deleteMin();
        System.out.println("AFTER delete -> " + queueAChar.toString());

        System.out.println("\nqueueBChar->");
        System.out.println("BEFORE delete -> " + queueBChar.toString());
        queueBChar.deleteMin();
        System.out.println("AFTER delete -> " + queueBChar.toString());

        System.out.println("\n\nFor String -->>");
        System.out.println("\nqueueAStr->");
        System.out.println("BEFORE delete -> " + queueAStr.toString());
        queueAStr.deleteMin();
        System.out.println("AFTER delete -> " + queueAStr.toString());

        System.out.println("\nqueueBStr->");
        System.out.println("BEFORE delete -> " + queueBStr.toString());
        queueBStr.deleteMin();
        System.out.println("AFTER delete -> " + queueBStr.toString());

    }

    private static void readFileQueue(String fileName, PriorityQueueA<Integer> queueAInt, PriorityQueueA<Double> queueADouble,
                                      PriorityQueueA<Character> queueAChar, PriorityQueueA<String> queueAStr,
                                      PriorityQueueB<Integer> queueBInt, PriorityQueueB<Double> queueBDouble,
                                      PriorityQueueB<Character> queueBChar, PriorityQueueB<String> queueBStr){
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
                queueAInt.offer(Integer.parseInt(temp));
                queueBInt.offer(Integer.parseInt(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                queueADouble.offer(Double.parseDouble(temp));
                queueBDouble.offer(Double.parseDouble(temp));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                queueAChar.offer(temp.charAt(0));
                queueBChar.offer(temp.charAt(0));
            }

            line = bufferedReader.readLine();
            tok = new StringTokenizer(line, ",");
            while (tok.hasMoreElements()) { /**Her satir ait oldugu arraye eklenir.*/
                temp = (String)tok.nextElement();
                queueAStr.offer(temp);
                queueBStr.offer(temp);
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

    private static void printFile(String outFile, PriorityQueueA<Integer> queueAInt, PriorityQueueA<Double> queueADouble,
                                  PriorityQueueA<Character> queueAChar, PriorityQueueA<String> queueAStr,
                                  PriorityQueueB<Integer> queueBInt, PriorityQueueB<Double> queueBDouble,
                                  PriorityQueueB<Character> queueBChar, PriorityQueueB<String> queueBStr){

        BufferedWriter output = null;
        try {
            File file = new File(outFile);
            output = new BufferedWriter(new FileWriter(file));
            String size;

            output.write("PriorityQueueA ->>\n");
            size = new String();
            size += queueAInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueAInt.toString());
            output.write("\n");
            size = new String();
            size += queueADouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueADouble.toString());
            output.write("\n");
            size = new String();
            size += queueAChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueAChar.toString());
            output.write("\n");
            size = new String();
            size += queueAStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueAStr.toString());
            output.write("\n");


            ///////////////////Queue
            output.write("\n\nPriorityQueueB ->>\n");
            size = new String();
            size += queueBInt.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueBInt.toString());
            output.write("\n");
            size = new String();
            size += queueBDouble.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueBDouble.toString());
            output.write("\n");
            size = new String();
            size += queueBChar.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueBChar.toString());
            output.write("\n");
            size = new String();
            size += queueBStr.size();
            output.write(size.toString());
            output.write(" ==> ");
            output.write(queueBStr.toString());
            output.write("\n");

            output.close();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}
