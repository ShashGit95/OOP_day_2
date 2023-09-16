import java.util.*;
class Stack{
    private int[] dataArray;
    Stack(){
        dataArray=new int[0];
    }
    public void push(int data){
        extendsArray();
        dataArray[dataArray.length-1]=data;
    }
    private void extendsArray(){
        int[] tempDataArray=new int[dataArray.length+1];
        for (int i = 0; i < dataArray.length; i++){
            tempDataArray[i]=dataArray[i];
        }
        dataArray=tempDataArray;
    }
    private boolean isEmpty(){
        return dataArray.length<=0;
    }
    public void printStack(){
        System.out.print("[");
        for (int i = dataArray.length-1; i >=0 ; i--){
            System.out.print(dataArray[i]+", ");
        }
        System.out.println(isEmpty()? "empty]":"\b\b]");
    }
    public int size(){
        return dataArray.length;
    }
    public void clear(){
        dataArray=new int[0];
    }
    public void pop(){
        if(dataArray.length>0){
            int[] tempDataArray=new int[dataArray.length-1];
            for(int i=0; i<tempDataArray.length; i++){
                tempDataArray[i]=dataArray[i];
            }
            dataArray=tempDataArray;
        }else{
            System.out.println("Stakc is empty...");
        }
    }
    public boolean contains(int data){
        for (int i = 0; i < dataArray.length; i++){
            if(dataArray[i]==data){
                return true;
            }
        }
        return false;
    }

    public int[] toArray(){
        int[] temp = new int[dataArray.length];
        for(int i=0; i< dataArray.length;i++){
            temp[i] = dataArray[dataArray.length-1-i];
        }
        return temp;
    }
}
class Demo{
    public static void main(String args[]){
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]

        int[] ar=s1.toArray();
        System.out.println(Arrays.toString(ar)); //[50,40,30,20,10]
    }
}
