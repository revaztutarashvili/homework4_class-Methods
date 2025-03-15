public class Car {

///   აქ შემოვიტანე კონსტრუქტორი არგუმენტების გარეშე
    public Car() {

    }
///   აქ შემოვიტანე კონსტრუქტორი არგუმენტებით
    public Car(String make,String model, int releaseDate, String type, int maxSpeed, float engine){
        this.make=make;
        this.model=model;
        this.releaseDate=releaseDate;
        this.type=type;
        this.maxSpeed=maxSpeed;
        this.engine=engine;
    }


// აქ გავწერე ფრაივით ფილდები

    private String make;
    private String model;
    private int releaseDate;
    private String type;
    private float engine;
    private int maxSpeed ;


///    აქ არგუმენტებს ვანიჭებ გეთერებს და სეთერებს

    public String getMake(){
        return make;
    }
    public void setMake(String mercedes){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String cls){
        this.model=model;
    }
    public int getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(int i) {
        this.releaseDate=releaseDate;
    }
    public String getType(){
        return type;
    }
    public void setType(String coupeSedan){
        this.type=type;
    }
    public float getEngine(){
        return engine;
    }
    public void setEngine(float v){
        this.engine=engine;
    }
    public int getMaxSpeed (){
        return maxSpeed;
    }
    public void setMaxSpeed(int i){
        this.maxSpeed=maxSpeed;
    }



}
