package com.company;

public class Node {
    public JobLead lead;
    public Node next;
    public Node prev;
    Node(){}
    Node(JobLead inputLead){
        lead = inputLead;
        next = null;
        prev = null;
    }
}
