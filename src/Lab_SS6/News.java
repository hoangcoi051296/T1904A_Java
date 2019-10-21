package Lab_SS6;

public class News  implements INews{
    public int ID;
    public String tittle;
    public String publistDate;
    public String author;
    public String content;
    public float averageRate;

    public int[] ratelist = new int[3];

    @Override
    public void Display() {
        System.out.println(this.getTittle());
        System.out.println(this.getID());
        System.out.println(this.getAuthor());
        System.out.println(this.getPublistDate());
        System.out.println(this.getContent());
        System.out.println(this.getAverageRate());
    }

    public News() {
    }

    public News(int ID, String tittle, String publistDate, String author, String content) {
        this.ID = ID;
        this.tittle = tittle;
        this.publistDate = publistDate;
        this.author = author;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublistDate() {
        return publistDate;
    }

    public void setPublistDate(String publistDate) {
        this.publistDate = publistDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void Caculate(){
        float f=0;
        for(int r : ratelist){
            f+=r;
        }
        this.averageRate=f/3;
    }

}
