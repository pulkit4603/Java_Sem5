public class Book(){
  int id;
  String title, author;
  float cost;
  
  Book(){
    //default
  }

  Book(int id, String title, String author, float cost){
    this.id = id;
    this.title = title;
    this.author = author;
    this.cost = cost;
  }

  float getCost(){
    return cost;
  }
}
