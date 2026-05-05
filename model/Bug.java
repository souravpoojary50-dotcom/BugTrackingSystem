public class Bug {
    // Bug model class
    private int id;
    private String title;
    private String priority;
    private String status;
    private String assignedTo;
    public Bug(int id, String title, String priority,  String assignedTo) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        
        this.assignedTo = assignedTo;
        this.status="Open";
    }
    public int getId() {
        return id;
    
        
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public String toFileString(){
        return id+","+title+","+priority+","+status+","+assignedTo;
    }
    public static Bug fromFileString(String line){
        String[] data=line.split(",");
        Bug b=new Bug(Integer.parseInt(data[0]),data[1],data[2],data[4]);
        b.setStatus(data[3]);
        return b;
    }
    public void display(){
        System.out.println(id+"|"+title+"|"+priority+"|"+status+"|"+assignedTo);
    }

    

}