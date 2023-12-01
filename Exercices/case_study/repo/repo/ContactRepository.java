package Exercices.case_study.repo.repo;

import Exercices.case_study.model.Contract;
import Exercices.case_study.repo.interface_repo.IContactRepository;

import java.util.ArrayList;
import java.util.List;

public class ContactRepository implements IContactRepository<Contract> {
    private List<Contract> contractList = new ArrayList<>();
}
