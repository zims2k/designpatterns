package at.zims2k.visitor;

import at.zims2k.visitor.fileelements.audio.AudioFile;
import at.zims2k.visitor.fileelements.audio.AudioUnit;
import at.zims2k.visitor.fileelements.image.ImageFile;
import at.zims2k.visitor.fileelements.image.ImageUnit;
import at.zims2k.visitor.fileelements.text.TextFile;
import at.zims2k.visitor.interfaces.FileElement;

import java.util.List;

public class Util {
    static List<FileElement> getFileElements() {
        return List.of(
                new TextFile("aText.txt", "This is the file's content"),
                new ImageFile("image.bmp", generateRandomImageUnits(3000)),
                new AudioFile("audio.wav", generateRandomAudioUnits(16000)),
                new TextFile("aText2.txt", "This is another file's content"),
                new ImageFile("image2.bmp", generateRandomImageUnits(2000)),
                new AudioFile("audio2.wav", generateRandomAudioUnits(18000))
        );
    }

    static ImageUnit[] generateRandomImageUnits(int numberOfUnitsToGenerate) {
        ImageUnit[] imageUnits = new ImageUnit[numberOfUnitsToGenerate];

        for (int i = 0; i < numberOfUnitsToGenerate; i++) {
            imageUnits[i] = new ImageUnit(getRandomInt(), getRandomInt(), getRandomInt());
        }

        return imageUnits;
    }

    static AudioUnit[] generateRandomAudioUnits(int numberOfUnitsToGenerate) {
        AudioUnit[] audioUnits = new AudioUnit[numberOfUnitsToGenerate];

        for (int i = 0; i < numberOfUnitsToGenerate; i++) {
            audioUnits[i] = new AudioUnit(getRandomBytes());
        }

        return audioUnits;
    }

    static int getRandomInt() {
        return (int) (Math.random() * 255);
    }

    static byte[] getRandomBytes() {
        byte[] bytes = new byte[100];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (Math.random() * 255);
        }

        return bytes;
    }

    static void printTextFileContents(List<FileElement> fileElements) {
        fileElements.stream()
                .filter(TextFile.class::isInstance)
                .map(TextFile.class::cast)
                .forEach(textFile -> {
                    System.out.printf("File %s: ", textFile.getName());
                    System.out.println(textFile.getContent());
                });
    }
}