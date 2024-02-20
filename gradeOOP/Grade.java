package gradeOOP;

public class Grade {
    private String name;
    private int koreanScore;
    private int englishScore;
    private int mathScore;
    private int average;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void createRandomKoreanScore(){
        this.koreanScore = (int) (Math.random()*100);
    }
    public int getKoreanScore(){
        return this.koreanScore;
    }
    public void createRandomEnglishScore(){
        this.englishScore = (int) (Math.random()*100);
    }
    public int getEnglishScore(){
        return this.englishScore;
    }
    public void createRandomMathScore(){
        this.mathScore = (int) (Math.random()*100);
    }
    public int getMathScore(){
        return this.mathScore;
    }
    public void createAverage(){
        this.average = (this.englishScore
                        + this.koreanScore
                        + this.mathScore) / 3;
    }
    public int getAverage(){
        return this.average;
    }
}
