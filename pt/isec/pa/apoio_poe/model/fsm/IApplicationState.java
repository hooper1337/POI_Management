package pt.isec.pa.apoio_poe.model.fsm;

import pt.isec.pa.apoio_poe.model.data.person.Person;
import pt.isec.pa.apoio_poe.model.data.proposals.Proposal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface IApplicationState {
    boolean insertData(String file);

    String checkData();

    boolean editDataProposal(String identifier, String attribute, List<String> newValue);

    boolean editDataProfessor(String email, boolean advisor);

    boolean editDataStudent(String identifier, String change, String whatToChange);

    boolean deleteData(String identifier);

    boolean chooseType(String type);

    boolean closeState();

    boolean studentManager();

    boolean professorManager();

    boolean proposalManager();

    boolean candidatureManager();

    String listStudentsWithAutoProposal();

    String listStudentsWithCandidature();

    String listStudentsWithoutCandidature();

    String listAutoProposalWithoutCandidatures();

    String listAutoProposalWithCandidatures();

    boolean proposalAttributionManager();

    boolean associateAttribution();

    ArrayList<Person> nonAssociateAttribution();

    boolean chooseStudentToAssociate(ArrayList<Person> studentsProposals, int index);

    boolean manualAttribution(String idOfProposal, long idOfStudent);

    boolean manualRemoval(String idOfProposal);

    boolean professorAttributionManager();

    boolean listStudentsWithProposalWithoutProfessor();

    boolean listStudentsWithProposalAndProfessor();

    boolean averageProfessorAttributions();

    boolean minimumProfessorAttributions();

    boolean maximumProfessorAttributions();

    boolean specificProfessorAttributions();

    boolean listProposalsWithAttributions();

    boolean listProposalsWithoutAttributions();

    boolean listStudentsWithProposals();

    boolean listStudentsWithoutProposalsWithCandidature();

    ApplicationState getState();

    boolean removeProposalFromCandidature(String id, String proposal);

    boolean removeCandidature(String id);

    boolean editCandidatures(String id, String proposal);

    String listProposalsFilters(List<Integer> filters);

    String listStudentWithProposalAttributed();

    String listStudentWithoutProposalAttributed();
}