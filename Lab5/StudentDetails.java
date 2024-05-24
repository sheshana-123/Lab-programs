package Anudip;

public class StudentDetails {
        private int id;
        private String name;
        private boolean active;
        
             
        public StudentDetails(int id,String name,boolean active)
        {
        	this.id=id;
        	this.name=name;
        	this.active=active;
        }
           public int getId()
        {
         return id;
        }
           public String getName()
           {
            return name;
        }
           public boolean isActive()
           {
           return active;
           }
               public void setId(int id)
               {
            	   this.id=id;
               }
           public void setName(String name)
           {
               this.name=name;
           }  
           public void setActive(boolean active) 
           {
        	   this.active=active;
          		@Override 
        		public String tostring()  
        		{
           return "student{"+
        		"id=" + id +
        		"id=" + id +
        		",name='" + name + '\'' +
        		",active=" + active + '}';          
        	public static void main(String[] args)
        	{		
        		StudentDetails student = new StudentDetails(123,"sheshana",true);
        		System.out.println(student); 
        		student.setId(123);
        		student.setActive(false);
        		System.out.println(student);
        	}
          		} 	
           