package case_study.repo.repo;

import case_study.model.Contract;
import case_study.repo.interface_repo.IContractRepository;
import case_study.util.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;

public class ContractRepository implements IContractRepository<Contract> {
    private static final String CONTRACT_DATA = "case_study/data/booking.csv";

    @Override
    public List<Contract> getAll() {
        List<String> stringList = ReadAndWriteFileCSV.readfileCSV(CONTRACT_DATA);
        List<Contract> contractList = new ArrayList<>();
        String[] array;
        for (String s : stringList) {
            array = s.split(",");
            contractList.add(new Contract(array[0], array[1], Double.parseDouble(array[2]), Double.parseDouble(array[3])));
        }
        return contractList;
    }

    @Override
    public void add(Contract contract) {
        List<String> stringList = new ArrayList<>();
        stringList.add(contract.getInforToCSV());
        ReadAndWriteFileCSV.writeListStringToCSV(CONTRACT_DATA, stringList, true);
    }

    @Override
    public void remove(int index) {
        List<String> stringList = new ArrayList<>();
        List<Contract> contractList = getAll();
        for (int i = 0; i < contractList.size(); i++) {
            if (i != index) {
                stringList.add(contractList.get(i).getInforToCSV());
            }
        }
        ReadAndWriteFileCSV.writeListStringToCSV(CONTRACT_DATA, stringList, false);
    }

    @Override
    public int searchByID(String idContract) {
        List<Contract> contractList = getAll();
        for (int i=0;i<contractList.size();i++){
            if(contractList.get(i).getIdContract().equals(idContract)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(List<Contract> t) {

    }


}
