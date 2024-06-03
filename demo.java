
 class student {

    // data : data members: instance variable

     int studentId;
     String studentName;
     String studentCity;

     //Behavoour :member methods :methods :(functions)
     public void study(){
        System.out.println(studentName+""+ "is studying");
        }
        public void showfulldetails(){
            System.out.println("My name is"+" "+studentName);
            System.out.println("My ID is"+" "+studentId); 
            System.out.println("My City is"+" "+studentCity);
            }
        }
         public class demo{
            
            public static void main(String[] args) {41
                //now creating ooject of oops
                student obj = new student();
                obj.studentId = 1;
                obj.studentName = "Rahul";
                obj.studentCity = "Delhi";
                obj.study();
                obj.showfulldetails();
                        
}
}
