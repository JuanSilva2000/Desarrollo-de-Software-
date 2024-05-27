package E2;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
       try{
           Role admin = new Role("Admin");
           Role user = new Role("User");

           Permission readPermission = new Permission("Read","Can read document");
           Permission editPermission = new Permission("Edit","Can Edit document");

           //Permisos del admin
           admin.addPermission(readPermission);
           admin.addPermission(editPermission);

           //Permisos del usuario
           user.addPermission(readPermission);

           User userJ = new User("Juan","123");
           User userO = new User("Omar", "456");
           User userP = new User("Piero", "789");

           //User1 tiene rol de admin
           userJ.addRole(admin);

           //User2 tiene rol de usuario
           userO.addRole(user);

           //User3 tiene rol de usuario
           userP.addRole(user);

           // Autenticación de los usuarios
           if(userJ.authenticate("Juan", "123")) System.out.println("Autenticacion Exitosa para " + userJ.getUsername()); else
               System.out.println("Fallo autenticación");

           if(userO.authenticate("Omar", "456")) System.out.println("Autenticacion Exitosa para " + userO.getUsername()); else
               System.out.println("Fallo autenticación");

           if(userP.authenticate("Piero", "781")) System.out.println("Autenticacion Exitosa para " + userP.getUsername());else
               System.out.println("Fallo autenticación");

           System.out.println("\n\n");

           //Permisos
           if(userJ.hasPermission("Read") && userJ.hasPermission("Edit")){
               System.out.println(userJ.getUsername() + " can edit and read" );
           }else{
               System.out.println(userJ.getUsername() + " hasn't permission");
           }

           if(userO.hasPermission("Edit")){
               System.out.println(userO.getUsername() + " can edit");
           }else {
               System.out.println(userO.getUsername() + " can't edit only to read");
           }


       }catch (NoSuchAlgorithmException e){
           System.out.println(e);
       }

    }
}
