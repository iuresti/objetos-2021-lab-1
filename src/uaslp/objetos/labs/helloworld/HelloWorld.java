package uaslp.objetos.labs.helloworld;

public class HelloWorld
{
	public static void main(String []args)
	{
		System.out.println("Número de argumentos:" + args.length);
		
		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);
		}
		
		System.out.println("Hola mundo!!");

		System.out.println("Iván ");
	}
}