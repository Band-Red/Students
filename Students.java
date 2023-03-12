public class Students {
private int id;
public String name;
public Students(int id,String name){
    this.id =id;
    this.name =name;
}
public int getID(){
    return id;
}
public String getName(){
    return name;
}
public void setID(int id){
    this.id = id;
}
public void setName(String name){
    this.name = name;
}
@Override
public String toString(){
    return this.id + this.name;
}
}