package it.develhope.annotations;
public class Start {
    public static void main(String args[])
    {
        Greetings greetings = new Greetings();
        java.lang.reflect.Method[] methods = Greetings.class.getMethods();
        for (java.lang.reflect.Method method : methods)
        {
            if (method.isAnnotationPresent(DevAnnotation.class))
            {
                DevAnnotation annotation = method.getAnnotation(DevAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Name: " + annotation.devName());
                System.out.println("Surname: " + annotation.devSurname());
                try
                {
                    method.invoke(greetings);
                }
                catch (Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
                System.out.println();
            }
        }
    }
}