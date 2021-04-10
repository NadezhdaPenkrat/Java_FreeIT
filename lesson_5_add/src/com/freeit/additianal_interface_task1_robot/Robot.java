package com.freeit.additianal_interface_task1_robot;


import additianal_interface_task1_robot.hands.IHand;
import additianal_interface_task1_robot.heads.IHead;
import additianal_interface_task1_robot.legs.ILeg;

//@Data
public class Robot implements IRobot {

    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head,
                 IHand hand,
                 ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }


    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
