package com.company.workflowexample.web.screens.contract;

import com.haulmont.bpm.entity.ProcAttachment;
import com.haulmont.bpm.gui.procactionsfragment.ProcActionsFragment;
import com.haulmont.cuba.gui.app.core.file.FileDownloadHelper;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.workflowexample.entity.Contract;

import javax.inject.Inject;

@UiController("workflowexample_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
public class ContractEdit extends StandardEditor<Contract> {
    private static final String PROCESS_CODE = "contractApprovel";

    @Inject
    private CollectionLoader<ProcAttachment> procAttachmentsDl;

    @Inject
    private InstanceContainer<Contract> contractDc;

    @Inject
    protected ProcActionsFragment procActionsFragment;

    @Inject
    private Table<ProcAttachment> attachmentsTable;

    @Inject
    private InstanceLoader<Contract> contractDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        contractDl.load();
        procAttachmentsDl.setParameter("entityId",contractDc.getItem().getId());
        procAttachmentsDl.load();
        procActionsFragment.initializer()
                .standard()
                .init(PROCESS_CODE, getEditedEntity());

        FileDownloadHelper.initGeneratedColumn(attachmentsTable, "file");
    }
}