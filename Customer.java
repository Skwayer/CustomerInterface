import java.util.*;
public class Customer {
    private int id;
    private String password;
    private String firstName;
    private String lastName;
    private String question;
    private String answer;
    private String address;
    private int ccNumber;

    Customer(int id, String password, String question, String answer, String address, int ccNumber){
        this.id = id;
        this.password = password;
        this.question = question;
        this.answer = answer;
        this.address = address;
        this.ccNumber = ccNumber;
    }

    public int getId() {return id;}
    public String getPassword() {return password;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getQuestion() {return question;}
    public String getAnswer() {return answer;}
    public String getAddress() {return address;}
    public int getCcNumber() {return ccNumber;}

    public void setId(int id){this.id = id;}
    public void setPassword(String password){this.password = password;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setQuestion(String question){this.question = question;}
    public void setAnswer(String answer){this.answer = answer;}
    public void setAddress(String address){this.address = address;}
    public void setCcNumber(int ccNumber){this.ccNumber = ccNumber;}

    public void createCustomer(){

    }

    static class inOut{
        void logIn(int idInput, String passwordInput, ArrayList<Customer> customerList){
            int index = 0;
            for(Customer customer : customerList){
                if(customer.getId() == idInput){
                    if(passwordInput.equals(customer.getPassword())){
                        System.out.println(customerList.get(index).question);
                        Scanner keyboard = new Scanner(System.in);
                        String answerRequest = keyboard.nextLine();
                        if (answerRequest.equals(customerList.get(index).answer)){
                            System.out.println("Welcome back!");
                        }
                    }
                }
                index++;
            }
        }
        void logOut(int idInput, ArrayList<Customer> customerList){
            int index = 0;
            for (Customer customer : customerList){
                if (customer.getId() == idInput){
                    customerList.remove(index);
                }
                index++;
            }
        }
    }
}
