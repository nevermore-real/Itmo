package Commands;


import MyExceptions.MyException;

public class GroupCountingByPartNumber extends Command {
    @Override
    public CommandBox execute() throws MyException {

        return reciever.executeGroupCountingByPartNumber();
    }
    public void getHelp(){
        System.out.println("group_counting_by_part_number --- сгруппировать элементы коллекции по значению поля partNumber, вывести количество элементов в каждой группе");
    }
}
