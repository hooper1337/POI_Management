package pt.isec.pa.apoio_poe.model.data.proposals;

import java.io.Serializable;
import java.util.Objects;

import pt.isec.pa.apoio_poe.model.data.person.Student;

abstract public class Proposal implements Serializable , Cloneable{
    private String idOfProposal;
    private String title;
    private Student student;

    public Proposal(String idOfProposal, String title, Student student) {
        this.idOfProposal = idOfProposal;
        this.title = title;
        this.student = student;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            Proposal newProposal = (Proposal) super.clone();
            return newProposal;
        }catch (CloneNotSupportedException e){
            return null;
        }
    }

    public String getIdOfProposal() {
        return idOfProposal;
    }

    public void setIdOfProposal(String idOfProposal) {
        this.idOfProposal = idOfProposal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getStudent() {
        if (student == null)
            return -1;

        return student.getId();
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Proposal))
            return false;

        Proposal aux = (Proposal) obj;

        return this.idOfProposal.equals(aux.getIdOfProposal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOfProposal);
    }

}
