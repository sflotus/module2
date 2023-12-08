package case_study.repo.repo;

import case_study.model.Booking;
import case_study.model.Contract;
import case_study.repo.interface_repo.IContractRepository;

import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository<Contract> {
    private static final String CONTRACT_DATA = "src/case_study/data/booking.csv";
    @Override
    public List<Contract> getAll() {
        return null;
    }

    @Override
    public void add(Contract contract) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void diplayAll() {

    }

    @Override
    public int searchByID(String id) {
        return 0;
    }

    @Override
    public void edit(Contract contract) {

    }
}
