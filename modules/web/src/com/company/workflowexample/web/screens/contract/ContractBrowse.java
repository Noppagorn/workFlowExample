package com.company.workflowexample.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.workflowexample.entity.Contract;

@UiController("workflowexample_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
@LoadDataBeforeShow
public class ContractBrowse extends StandardLookup<Contract> {
}