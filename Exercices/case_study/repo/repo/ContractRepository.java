package Exercices.case_study.repo.repo;

import Exercices.case_study.model.Booking;
import Exercices.case_study.model.Contract;
import Exercices.case_study.repo.interface_repo.IContractRepository;

import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository<Contract> {
    private ArrayList<Contract> contractList = new ArrayList<>();


    @Override
    public ArrayList<Contract> getAll() {
        return contractList;
    }

    @Override
    public void add(Contract contract) {
        contractList.add(contract);
    }

    @Override
    public void remove(int index) {
        contractList.remove(index);
    }
    @Override
    public void diplayAll() {
        for (Contract c:contractList
        ) {
            System.out.println(c);
        }
    }

    @Override
    public int searchByID(String id) {
        for(int i =0;i<contractList.size();i++){
            if ( contractList.get(i).getIdContract().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
