import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflete {
    private static final String OBJECT = Object.class.getSimpleName();
    public static void lista(Object obj) {
        try {
            System.out.println("Classe: "+obj.getClass().getSimpleName());
            System.out.println("SuperClass:"+obj.getClass().getSuperclass().getSimpleName());

            System.out.println("--------atributos---------");
            listaAtributos(obj.getClass());

            System.out.println("--------métodos-----------");
            listaMetodos(obj.getClass());
            System.out.println("--------------------------");
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }

    private static void listaAtributos(Class <?> cls) {

        if(cls.getSimpleName().equals(OBJECT)){ return; }

        Field[] lista = cls.getDeclaredFields();
        for (Field fld : lista){
            System.out.println("nome atributo = " + fld.getName());
            System.out.println("membro da classe = " + fld.getDeclaringClass());
            System.out.println("tipo = " + fld.getType());
            int mod = fld.getModifiers();
            System.out.println("modificadores = " + Modifier.toString(mod));
            System.out.println();
        }
        listaAtributos(cls.getSuperclass());
    }

    private static void listaMetodos(Class <?> cls){
        if(cls.getSimpleName().equals(OBJECT)){ return; }

        System.out.println(cls.getSimpleName());
        Method[] lista = cls.getDeclaredMethods();
        for(Method m : lista){
            System.out.println( m.toString());
        }
        System.out.println();

        listaMetodos(cls.getSuperclass());
    }
}