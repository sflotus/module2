package case_study.services.services;

import case_study.repo.interface_repo.IContractRepository;
import case_study.repo.repo.ContractRepository;
import case_study.services.interface_services.IContactService;

public class ContractService implements IContactService {
    private IContractRepository contactRepository = new ContractRepository();

    @Override
    public void diplayAll() {

    }

    @Override
    public void add() {

    }

    @Override
    public void editByID() {

    }
}
