package Exercices.case_study.services.services;

import Exercices.case_study.repo.interface_repo.IContactRepository;
import Exercices.case_study.repo.repo.ContactRepository;
import Exercices.case_study.services.interface_services.IContactService;

public class ContactService implements IContactService {
    private IContactRepository contactRepository = new ContactRepository();
}
