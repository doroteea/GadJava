package lab3.visitor;

public class TimeVisitor implements Visitor{
    private int totalTime = 0;
    @Override
    public void visit(Book book) {
        totalTime+=book.getNumberOfPages() * 4;
    }

    @Override
    public void visit(Video video) {
        totalTime += video.getTime();
    }

    @Override
    public void visit(Audio audio) {
        totalTime += audio.getTime();
    }

    public String  toString(){
        return "Total time : " + totalTime;
    }
}
