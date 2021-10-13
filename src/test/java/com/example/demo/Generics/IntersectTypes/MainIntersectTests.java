package com.example.demo.Generics.IntersectTypes;

import org.junit.Test;

import java.io.*;

public class MainIntersectTests {

    @Test
    public void testIntersectTypes() throws FileNotFoundException {
        PersonReader reader = new PersonReader();
        DataInputStream stream = new DataInputStream(
                new FileInputStream("src/main/resources/data.txt"));
        Person person = reader.read(stream);

        RandomAccessFile randomAccessFile = new RandomAccessFile(
                "src/main/resources/data.txt","rw"
        );
        person = reader.read(randomAccessFile);
        System.out.println(person);
    }


    // %USERPROFILE%\AppData\Local\Temp
    @Test
    public void testWriteObject() throws Exception {

        System.out.println(System.getProperty("java.io.tmpdir"));

        Runnable helloWorld = (Serializable & Runnable)() ->
        {
            System.out.println("Hello World");
        };
        helloWorld.run();
        File file = File.createTempFile("runnable","tmp");
        file.deleteOnExit();
        writeToFile(file, helloWorld);
        final Runnable runnable = (Runnable) readFromFile(file);
        runnable.run();
    }
    private static void writeToFile(final File file, Object object) throws IOException
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)))
        {
            oos.writeObject(object);
        }
    }

    private static Object readFromFile(final File file) throws Exception
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)))
        {
            return ois.readObject();
        }
    }
}
