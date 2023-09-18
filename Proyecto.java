public class Proyecto {
    
    public static void main(String[] args) throws Exception { 
           
            String My_Name = "Ruth Velasquez";
            String Mom_Name = "Detsy Bello";
            String Father_Name = "Richard Velasquez";
            String My_Dog  = "Apolo";
            String My_Cats_Female = "Catalina";
            String My_Cats_Male = "Coco";


            int myAge = 33;
            int momAge = 51;
            int fatherAge = 54;
            int My_DogAge = 5; 
            int My_CatsFemaleAge = 6;
            int My_CatsMaleAge = 1; 

            System.out.println("Hola les presento a mi familia");
            System.out.println("Esta soy yo: "+ My_Name + " y tengo " +  myAge);
            System.out.println("Ella es mi madre: " + Mom_Name + " y tiene " + momAge);
            System.out.println("El es mi padre: " + Father_Name + " y tiene " + fatherAge);
            System.out.println("El es mi perro: " + My_Dog + " y tiene " + My_DogAge);
            System.out.println("Ella es mi gata: " + My_Cats_Female + " y tiene " + My_CatsFemaleAge);  
            System.out.println("El es mi gato: " + My_Cats_Male + " y tiene " + My_CatsMaleAge);

            int dogs = 1;
            int cats = 2;

            if (dogs == cats) {  
                System.out.println("Tengo las mismas cantidad de mascostas");
            } else if(dogs > cats){
                System.out.println("Tengo mas perritos que gaticos");
            } else if(dogs < cats) {
                System.out.println("Tengo mas gaticos que perritos");

            }
            
            String AnimalFavorito = "Apolo";

        switch(AnimalFavorito) {
            case "Apolo":
                System.out.println("Mi perrito favorito es Apolo");
                break; 
            case "Cata":
                System.out.println("Mi gatico favorito es Catalina");
                break;
         }   
        }   
    }