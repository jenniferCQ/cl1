package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Producto;
import model.Usuario;

public class Main {
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPropuesto");
		EntityManager em = fabrica.createEntityManager();
		
		String usuario = "Jennifer";
		String password = "Camones";
//read(select)		
		List<Usuario> lstUsuario = em.createQuery("select u from Usuario u where u.login ='"+usuario+"' and u.password='"+password+"'",Usuario.class).getResultList();
		if(lstUsuario.size()>0) {
			System.out.print("Bienvenido al sistema ");
			
		}else {
			System.out.print("Usuario y/o contraseña incorrecta");
		}
//read(select fin)	

//read(select)
		List<Producto> listProducto = em.createQuery("Select p from Producto p ",Producto.class).getResultList();
       for(Producto p: listProducto){
    	   System.out.println("productos:"+ p.getIdProd()+" "+p.getDesProd()+" "+p.getStkProd() +" "+ p.getPreproProd()+""+ p.getEstProd()+" "+p.getTbCategoria()+" "+ p.getTbProveedor());
       }			
//read(select fin)    
       
//read(select por id)
        Producto pd = em.find(Producto.class,1); 
//read(select por id fin)
       fabrica.close();
		em.close();
	}

}
