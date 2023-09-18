class Box{
    int length;
    int width;
    int height;

    public Box(int length,int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public Box(){}
    public void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume of the box : "+volume);

    }
    public void setValues(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public void copyValuesFrom(Box box){
        this.length=box.length;
        this.width=box.width;
        this.height=box.height;
    }
    public Box getCopy(){
        Box temp=new Box();
        //copy value from this object to temp
        temp.setValues(length,width,height);
        return temp;
        //return new Box(length,width,height); //Legal
    }
}
class Demo{
    public static void main(String[] args){
        Box b1=new Box(12,5,3); //
        System.out.println("length of b1 : "+b1.length);//12
        System.out.println("width  of b1 : "+b1.width); //5
        System.out.println("height of b1 : "+b1.height);//3
        b1.printVolume(); //180

        Box b2=b1.getCopy();

        System.out.println("length of b2 : "+b2.length);//12
        System.out.println("width  of b2 : "+b2.width); //5
        System.out.println("height of b2 : "+b2.height);//3
        b2.printVolume(); //180
        System.out.println(b1==b2); //false
    }
}
