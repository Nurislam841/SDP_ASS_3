package Fourth_task;

public class MainDecotatorTask {
    public static void main(String[] args){
        TextEditor plainText = new SimpleText();
        TextEditor boldText = new BoldDecorator(plainText);
        TextEditor italicBoldText = new ItalicDecorator(boldText);

        System.out.println(plainText.write());
        System.out.println(boldText.write());
        System.out.println(italicBoldText.write());

    }
}