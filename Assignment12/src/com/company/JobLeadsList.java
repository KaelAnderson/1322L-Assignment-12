package com.company;

import java.util.Objects;

public class JobLeadsList {
    private Node Head;
    private Node Tail;

    JobLeadsList(){
        Head = null;
        Tail = null;
    }
    public void add_to_front(String inputcompanyName, String inputcontactName, String inputcontactPhone, String inputjobTitle, String inputjobDescription){
        Node temp = new Node(new JobLead(inputcompanyName,inputcontactName,inputcontactPhone,inputjobTitle,inputjobDescription));
        temp.next = Head;
        temp.prev = null;
        if(!(Head != null || Tail != null)){
            Head = temp;
            Tail = temp;
            System.out.println("addition to front was successful");
        }else {
            while (Head.prev != null){
                Head = Head.prev;
            }
            Head.prev = temp;
            temp.next = Head;
            Head = temp;
            System.out.println("addition to front was successful");
        }

    }
    public void add_to_tail(String inputcompanyName, String inputcontactName, String inputcontactPhone, String inputjobTitle, String inputjobDescription){
        Node temp = new Node(new JobLead(inputcompanyName,inputcontactName,inputcontactPhone,inputjobTitle,inputjobDescription));
        temp.prev = Tail;
        temp.next = null;
        if(!(Head != null || Tail != null)){
            Tail = temp;
            Head = temp;
            System.out.println("addition to back was successful");
        }else {
            //Node curr = Tail;
            while(Tail.next != null){
                Tail = Tail.next;
            }
            Tail.next = temp;
            temp.prev = Tail;
            Tail = temp;
            System.out.println("addition to back was successful");
        }

    }
    public void remove_lead(String inputCompanyName, String inputJobTitle) {
        if(Head == null){
            System.out.println("There are no leads to delete");
        }
        if(Objects.equals(Head.lead.getCompanyName(), inputCompanyName) && Objects.equals(Head.lead.getJobTitle(), inputJobTitle)){
            Head = Head.next;
            if (Head != null)
            {
                Head.prev = null;
            }
            else
            {
                Tail = null;
            }
        }
        else if (Objects.equals(Tail.lead.getCompanyName(), inputCompanyName) && Objects.equals(Tail.lead.getJobTitle(), inputJobTitle))
        {
            Tail = Tail.prev;
            if (Tail != null)
            {
                Tail.next = null;
            }
            else
            {
                Head = null;
            }
        }
        else
        {
            Node temp = Head;
            while (temp != null && (!Objects.equals(temp.lead.getCompanyName(), inputCompanyName) && !Objects.equals(temp.lead.getJobTitle(), inputJobTitle)))
            {
                temp = temp.next;
            }
            if (temp == null)
            {
                System.out.println("Lead does not exist");
            }
            else
            {
                temp.prev.next = temp.next;
                if (temp.next != null)
                {
                    temp.next.prev = temp.prev;
                }
            }
        }

    }
    public void print_head_to_tail(){
        if((!(Head != null || Tail != null))){
            System.out.println("there are no leads to display");
        }else {

            System.out.println(Head.lead.toString() + "\n");

            while (Head.next != null){
                Head = Head.next;
                System.out.println(Head.lead.toString() + "\n");

            }
        }
        while(Head.prev != null){
            Head = Head.prev;
        }
    }
    public void print_tail_to_head(){
        if((!(Head != null || Tail != null))){
            System.out.println("there are no leads to display");
        }else {

            System.out.println(Tail.lead.toString() + "\n");

            while (Tail.prev != null){
                Tail = Tail.prev;
                System.out.println(Tail.lead.toString() + "\n");

            }
        }
        while(Tail.next != null){
            Tail = Tail.next;
        }
    }
}
