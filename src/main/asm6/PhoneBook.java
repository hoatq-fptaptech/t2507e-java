package main.asm6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();
    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p: PhoneList){
            if(p.getName().equalsIgnoreCase(name)){
                if(p.getPhones().contains(phone)){
                    return;
                }
                p.getPhones().add(phone);
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p: PhoneList) {
            if (p.getName().equalsIgnoreCase(name)) {
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {
//        for(int i=0;i<PhoneList.size()-1;i++){
//            for(int j=0;j<PhoneList.size()-i-1;j++){
//                if(PhoneList.get(j).getName().compareTo(PhoneList.get(j+1).getName()) > 0){
//                    PhoneNumber p = PhoneList.get(j);
//                    PhoneList.set(j,PhoneList.get(j+1));
//                    PhoneList.set(j+1,p);
//                }
//            }
//        }

//        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
//            @Override
//            public int compare(PhoneNumber o1, PhoneNumber o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        Collections.sort(PhoneList,(o1,o2)->o1.getName().compareTo(o2.getName()));

        Collections.sort(PhoneList,Comparator.comparing(PhoneNumber::getName));
    }
}
