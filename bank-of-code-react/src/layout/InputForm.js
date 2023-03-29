import { isValidDateValue } from "@testing-library/user-event/dist/utils";
import { Button, Form, Row, Col, Alert } from "react-bootstrap";

const InputForm = (props) => {
  return (
    <>
      <Form.Group as={Row} className="mb-3">
      
        <Form.Label htmlFor={props.htmlFor} column sm={2}>
          {props.label}
        </Form.Label>
        <Col sm={props.size}>
          <Form.Control
            type={props.type}
            name={props.name}
            onChange={props.changeHandler}
            // required
            isInvalid={props.checkErr}
            value={props.value}
          />
          {props.children}
        </Col>
      </Form.Group>
     
      {/* <Button size="lg" type="submit" variant="primary" className="mx-4">
        Submit
      </Button> */}
    </>
  );
};

export default InputForm;
