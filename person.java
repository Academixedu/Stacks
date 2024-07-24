public class person {
        int age;
        String name;
        String bloodgroup;
       private String gender;
       private String address;
        public person(int age, String name, String bloodgroup, String gender,String address){ 
            this.age=age;
            this.name=name;
            this.bloodgroup=bloodgroup;
            this.gender=gender;
            this.address=address;
    
        }
        
    
        
        
        
    
        public String getGender() {
            return gender;
        }
    
    
    
    
    
    
        public void setGender(String gender) {
            this.gender = gender;
        }
    
    
    
    
    
    
        public String getAddress() {
            return address;
        }
    
    
    
    
    
    
        public void setAddress(String address) {
            this.address = address;
        }
    
    
    
    
    
    
        @Override
        public String toString() {
            return "person [age=" + age + ", name=" + name + ", bloodgroup=" + bloodgroup + ", gender=" + gender + ",address=" + address + "]";
        }
    
    
    
    
        public person() {
        }
        
    
        }
    
    

