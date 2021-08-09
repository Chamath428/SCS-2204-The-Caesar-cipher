object Caesar extends App {
  def  encrypt (text:String,shift:Int):String={
      var retuenString="";
      for (c<-text){
       var x= (c.toInt+shift).toChar;
        retuenString=retuenString.concat(x.toString);
      }
    return retuenString;
  }

  def  decrypt (text:String,shift:Int):String={
    var retuenString="";
    for (c<-text){
      var x= (c.toInt-shift).toChar;
      retuenString=retuenString.concat(x.toString);
    }
    return  retuenString;
  }

def caesar (fun:(String,Int)=>String,text:String,shift:Int):String=return fun(text,shift);


  val text=scala.io.StdIn.readLine("Enter Text:");
  val shift=scala.io.StdIn.readLine("Enter Shifting Number:").toInt;
  val encryptedText=caesar(encrypt,text,shift);
  val decryptedText=caesar(decrypt,encryptedText,shift);

  println("Encrypted Text="+encryptedText+"\nDecrypted Text="+decryptedText);

}
