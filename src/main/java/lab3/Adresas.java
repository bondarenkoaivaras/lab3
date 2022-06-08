package lab3;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Adresas {
    private HashSet<Adresas> adresai;

    Adresas(AddressFilePath ADDRESS_FILE_PATH){
        adresai = new HashSet<>();
        adresai = readFile(ADDRESS_FILE_PATH);
    }

    public HashSet<Adresas> readFile(AddressFilePath ADDRESS_FILE_PATH){

        HashSet<Adresas> adresai = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(new File(String.valueOf(ADDRESS_FILE_PATH))))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return adresai;
    }
}
