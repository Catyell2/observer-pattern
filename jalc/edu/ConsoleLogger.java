class ConsoleLogger implements Observer{
  public void observer (Message message){
    System.out.println(message);
  }
}
