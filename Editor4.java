import java.awt.Color;

public class Editor4 {
    static public void main(String[] args) {
        String source = (args[0]); 
        int n = Integer.parseInt(args[1]); 

        Color [][] sourceImage = Runigram.read(source);
        Color [][] targetImage = Runigram.grayScaled(sourceImage);

        Runigram.setCanvas(sourceImage); 
        Runigram.morph(sourceImage, targetImage, n);



    }
}