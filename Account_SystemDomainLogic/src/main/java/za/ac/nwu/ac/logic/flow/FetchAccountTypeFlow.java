package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.util.List;

public interface FetchAccountTypeFlow {
    List<AccountTypeDto> getAllAccountTypes();

    AccountTypeDto getAccountTypeMnemonic(String mnemonic);

    AccountTypeDto getAllAccountTypesByMnemonic(String mnemonic);
}
