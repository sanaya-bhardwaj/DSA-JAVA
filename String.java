public static void main(String args[]){
  //concatenation 
  String first Name ="tony";
  String lastName= "stark";
  String fullName =firstName + "@" + lastName;
  //tony@stark
  System.out.println(fullName.length());

  //charAt
  for(int i=0; i<fullName.length();i++){
      System.out.println(fullName.charAt(i));
      }
  }
}


//compare
String name1="tony";
String name2="tony";

//s1>s2 : +ve value
//s1 == : 0
//s1<s2 : -ve

if(name1.compare(name2)==0){
  System.out.println("Strings are equal");
} else {
  System.out.println("String are not equal");
}

//SUBSTRING
String sentence = " my name is tony";
//substring(beg index, end index)
String name = sentence.substring(11,sentence.length());
System.out.println(name);

// Strings are Immutable
  

    
