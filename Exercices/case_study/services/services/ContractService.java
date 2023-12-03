package Exercices.case_study.services.services;

import Exercices.case_study.repo.interface_repo.IContractRepository;
import Exercices.case_study.repo.repo.ContractRepository;
import Exercices.case_study.services.interface_services.IContactService;

public class ContractService implements IContactService {
    private IContractRepository contactRepository = new ContractRepository();

    @Override
    public void diplayAll() {

    }

    @Override
    public void add() {

    }


}
