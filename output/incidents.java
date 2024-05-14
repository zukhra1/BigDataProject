// ORM class for table 'incidents'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Apr 27 16:11:11 MSK 2024
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class incidents extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("incident_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.incident_number = (java.math.BigDecimal)value;
      }
    });
    setters.put("exposure_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.exposure_number = (java.math.BigDecimal)value;
      }
    });
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.id = (java.math.BigDecimal)value;
      }
    });
    setters.put("address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.address = (String)value;
      }
    });
    setters.put("incident_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.incident_date = (String)value;
      }
    });
    setters.put("call_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.call_number = (java.math.BigDecimal)value;
      }
    });
    setters.put("alarm_dttm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.alarm_dttm = (String)value;
      }
    });
    setters.put("arrival_dttm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.arrival_dttm = (String)value;
      }
    });
    setters.put("close_dttm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.close_dttm = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.city = (String)value;
      }
    });
    setters.put("zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.zipcode = (String)value;
      }
    });
    setters.put("battalion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.battalion = (String)value;
      }
    });
    setters.put("station_area", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.station_area = (String)value;
      }
    });
    setters.put("box", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.box = (String)value;
      }
    });
    setters.put("suppression_units", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.suppression_units = (java.math.BigDecimal)value;
      }
    });
    setters.put("suppression_personnel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.suppression_personnel = (java.math.BigDecimal)value;
      }
    });
    setters.put("ems_units", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.ems_units = (java.math.BigDecimal)value;
      }
    });
    setters.put("ems_personnel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.ems_personnel = (java.math.BigDecimal)value;
      }
    });
    setters.put("other_units", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.other_units = (java.math.BigDecimal)value;
      }
    });
    setters.put("other_personnel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.other_personnel = (java.math.BigDecimal)value;
      }
    });
    setters.put("first_unit_on_scene", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.first_unit_on_scene = (String)value;
      }
    });
    setters.put("estimated_property_loss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.estimated_property_loss = (java.math.BigDecimal)value;
      }
    });
    setters.put("estimated_contents_loss", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.estimated_contents_loss = (java.math.BigDecimal)value;
      }
    });
    setters.put("fire_fatalities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.fire_fatalities = (java.math.BigDecimal)value;
      }
    });
    setters.put("fire_injuries", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.fire_injuries = (java.math.BigDecimal)value;
      }
    });
    setters.put("civilian_fatalities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.civilian_fatalities = (java.math.BigDecimal)value;
      }
    });
    setters.put("civilian_injuries", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.civilian_injuries = (java.math.BigDecimal)value;
      }
    });
    setters.put("number_of_alarms", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.number_of_alarms = (java.math.BigDecimal)value;
      }
    });
    setters.put("primary_situation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.primary_situation = (String)value;
      }
    });
    setters.put("mutual_aid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.mutual_aid = (String)value;
      }
    });
    setters.put("action_taken_primary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.action_taken_primary = (String)value;
      }
    });
    setters.put("action_taken_secondary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.action_taken_secondary = (String)value;
      }
    });
    setters.put("action_taken_other", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.action_taken_other = (String)value;
      }
    });
    setters.put("detector_alerted_occupants", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.detector_alerted_occupants = (String)value;
      }
    });
    setters.put("property_use", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.property_use = (String)value;
      }
    });
    setters.put("area_of_fire_origin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.area_of_fire_origin = (String)value;
      }
    });
    setters.put("ignition_cause", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.ignition_cause = (String)value;
      }
    });
    setters.put("ignition_factor_primary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.ignition_factor_primary = (String)value;
      }
    });
    setters.put("ignition_factor_secondary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.ignition_factor_secondary = (String)value;
      }
    });
    setters.put("heat_source", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.heat_source = (String)value;
      }
    });
    setters.put("item_first_ignited", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.item_first_ignited = (String)value;
      }
    });
    setters.put("human_factors_associated_with_ignition", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.human_factors_associated_with_ignition = (String)value;
      }
    });
    setters.put("structure_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.structure_type = (String)value;
      }
    });
    setters.put("structure_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.structure_status = (String)value;
      }
    });
    setters.put("floor_of_fire_origin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.floor_of_fire_origin = (java.math.BigDecimal)value;
      }
    });
    setters.put("fire_spread", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.fire_spread = (String)value;
      }
    });
    setters.put("no_flame_spread", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.no_flame_spread = (String)value;
      }
    });
    setters.put("number_of_floors_with_minimum_damage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.number_of_floors_with_minimum_damage = (java.math.BigDecimal)value;
      }
    });
    setters.put("number_of_floors_with_significant_damage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.number_of_floors_with_significant_damage = (java.math.BigDecimal)value;
      }
    });
    setters.put("number_of_floors_with_heavy_damage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.number_of_floors_with_heavy_damage = (java.math.BigDecimal)value;
      }
    });
    setters.put("number_of_floors_with_extreme_damage", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.number_of_floors_with_extreme_damage = (java.math.BigDecimal)value;
      }
    });
    setters.put("detectors_present", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.detectors_present = (String)value;
      }
    });
    setters.put("detector_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.detector_type = (String)value;
      }
    });
    setters.put("detector_operation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.detector_operation = (String)value;
      }
    });
    setters.put("detector_effectiveness", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.detector_effectiveness = (String)value;
      }
    });
    setters.put("detector_failure_reason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.detector_failure_reason = (String)value;
      }
    });
    setters.put("automatic_extinguishing_system_present", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.automatic_extinguishing_system_present = (String)value;
      }
    });
    setters.put("automatic_extinguishing_sytem_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.automatic_extinguishing_sytem_type = (String)value;
      }
    });
    setters.put("automatic_extinguishing_sytem_perfomance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.automatic_extinguishing_sytem_perfomance = (String)value;
      }
    });
    setters.put("automatic_extinguishing_sytem_failure_reason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.automatic_extinguishing_sytem_failure_reason = (String)value;
      }
    });
    setters.put("number_of_sprinkler_heads_operating", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.number_of_sprinkler_heads_operating = (java.math.BigDecimal)value;
      }
    });
    setters.put("supervisor_district", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.supervisor_district = (String)value;
      }
    });
    setters.put("neighborhood_district", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.neighborhood_district = (String)value;
      }
    });
    setters.put("point", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.point = (String)value;
      }
    });
    setters.put("data_as_of", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.data_as_of = (String)value;
      }
    });
    setters.put("data_loaded_at", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        incidents.this.data_loaded_at = (String)value;
      }
    });
  }
  public incidents() {
    init0();
  }
  private java.math.BigDecimal incident_number;
  public java.math.BigDecimal get_incident_number() {
    return incident_number;
  }
  public void set_incident_number(java.math.BigDecimal incident_number) {
    this.incident_number = incident_number;
  }
  public incidents with_incident_number(java.math.BigDecimal incident_number) {
    this.incident_number = incident_number;
    return this;
  }
  private java.math.BigDecimal exposure_number;
  public java.math.BigDecimal get_exposure_number() {
    return exposure_number;
  }
  public void set_exposure_number(java.math.BigDecimal exposure_number) {
    this.exposure_number = exposure_number;
  }
  public incidents with_exposure_number(java.math.BigDecimal exposure_number) {
    this.exposure_number = exposure_number;
    return this;
  }
  private java.math.BigDecimal id;
  public java.math.BigDecimal get_id() {
    return id;
  }
  public void set_id(java.math.BigDecimal id) {
    this.id = id;
  }
  public incidents with_id(java.math.BigDecimal id) {
    this.id = id;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public incidents with_address(String address) {
    this.address = address;
    return this;
  }
  private String incident_date;
  public String get_incident_date() {
    return incident_date;
  }
  public void set_incident_date(String incident_date) {
    this.incident_date = incident_date;
  }
  public incidents with_incident_date(String incident_date) {
    this.incident_date = incident_date;
    return this;
  }
  private java.math.BigDecimal call_number;
  public java.math.BigDecimal get_call_number() {
    return call_number;
  }
  public void set_call_number(java.math.BigDecimal call_number) {
    this.call_number = call_number;
  }
  public incidents with_call_number(java.math.BigDecimal call_number) {
    this.call_number = call_number;
    return this;
  }
  private String alarm_dttm;
  public String get_alarm_dttm() {
    return alarm_dttm;
  }
  public void set_alarm_dttm(String alarm_dttm) {
    this.alarm_dttm = alarm_dttm;
  }
  public incidents with_alarm_dttm(String alarm_dttm) {
    this.alarm_dttm = alarm_dttm;
    return this;
  }
  private String arrival_dttm;
  public String get_arrival_dttm() {
    return arrival_dttm;
  }
  public void set_arrival_dttm(String arrival_dttm) {
    this.arrival_dttm = arrival_dttm;
  }
  public incidents with_arrival_dttm(String arrival_dttm) {
    this.arrival_dttm = arrival_dttm;
    return this;
  }
  private String close_dttm;
  public String get_close_dttm() {
    return close_dttm;
  }
  public void set_close_dttm(String close_dttm) {
    this.close_dttm = close_dttm;
  }
  public incidents with_close_dttm(String close_dttm) {
    this.close_dttm = close_dttm;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public incidents with_city(String city) {
    this.city = city;
    return this;
  }
  private String zipcode;
  public String get_zipcode() {
    return zipcode;
  }
  public void set_zipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  public incidents with_zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  private String battalion;
  public String get_battalion() {
    return battalion;
  }
  public void set_battalion(String battalion) {
    this.battalion = battalion;
  }
  public incidents with_battalion(String battalion) {
    this.battalion = battalion;
    return this;
  }
  private String station_area;
  public String get_station_area() {
    return station_area;
  }
  public void set_station_area(String station_area) {
    this.station_area = station_area;
  }
  public incidents with_station_area(String station_area) {
    this.station_area = station_area;
    return this;
  }
  private String box;
  public String get_box() {
    return box;
  }
  public void set_box(String box) {
    this.box = box;
  }
  public incidents with_box(String box) {
    this.box = box;
    return this;
  }
  private java.math.BigDecimal suppression_units;
  public java.math.BigDecimal get_suppression_units() {
    return suppression_units;
  }
  public void set_suppression_units(java.math.BigDecimal suppression_units) {
    this.suppression_units = suppression_units;
  }
  public incidents with_suppression_units(java.math.BigDecimal suppression_units) {
    this.suppression_units = suppression_units;
    return this;
  }
  private java.math.BigDecimal suppression_personnel;
  public java.math.BigDecimal get_suppression_personnel() {
    return suppression_personnel;
  }
  public void set_suppression_personnel(java.math.BigDecimal suppression_personnel) {
    this.suppression_personnel = suppression_personnel;
  }
  public incidents with_suppression_personnel(java.math.BigDecimal suppression_personnel) {
    this.suppression_personnel = suppression_personnel;
    return this;
  }
  private java.math.BigDecimal ems_units;
  public java.math.BigDecimal get_ems_units() {
    return ems_units;
  }
  public void set_ems_units(java.math.BigDecimal ems_units) {
    this.ems_units = ems_units;
  }
  public incidents with_ems_units(java.math.BigDecimal ems_units) {
    this.ems_units = ems_units;
    return this;
  }
  private java.math.BigDecimal ems_personnel;
  public java.math.BigDecimal get_ems_personnel() {
    return ems_personnel;
  }
  public void set_ems_personnel(java.math.BigDecimal ems_personnel) {
    this.ems_personnel = ems_personnel;
  }
  public incidents with_ems_personnel(java.math.BigDecimal ems_personnel) {
    this.ems_personnel = ems_personnel;
    return this;
  }
  private java.math.BigDecimal other_units;
  public java.math.BigDecimal get_other_units() {
    return other_units;
  }
  public void set_other_units(java.math.BigDecimal other_units) {
    this.other_units = other_units;
  }
  public incidents with_other_units(java.math.BigDecimal other_units) {
    this.other_units = other_units;
    return this;
  }
  private java.math.BigDecimal other_personnel;
  public java.math.BigDecimal get_other_personnel() {
    return other_personnel;
  }
  public void set_other_personnel(java.math.BigDecimal other_personnel) {
    this.other_personnel = other_personnel;
  }
  public incidents with_other_personnel(java.math.BigDecimal other_personnel) {
    this.other_personnel = other_personnel;
    return this;
  }
  private String first_unit_on_scene;
  public String get_first_unit_on_scene() {
    return first_unit_on_scene;
  }
  public void set_first_unit_on_scene(String first_unit_on_scene) {
    this.first_unit_on_scene = first_unit_on_scene;
  }
  public incidents with_first_unit_on_scene(String first_unit_on_scene) {
    this.first_unit_on_scene = first_unit_on_scene;
    return this;
  }
  private java.math.BigDecimal estimated_property_loss;
  public java.math.BigDecimal get_estimated_property_loss() {
    return estimated_property_loss;
  }
  public void set_estimated_property_loss(java.math.BigDecimal estimated_property_loss) {
    this.estimated_property_loss = estimated_property_loss;
  }
  public incidents with_estimated_property_loss(java.math.BigDecimal estimated_property_loss) {
    this.estimated_property_loss = estimated_property_loss;
    return this;
  }
  private java.math.BigDecimal estimated_contents_loss;
  public java.math.BigDecimal get_estimated_contents_loss() {
    return estimated_contents_loss;
  }
  public void set_estimated_contents_loss(java.math.BigDecimal estimated_contents_loss) {
    this.estimated_contents_loss = estimated_contents_loss;
  }
  public incidents with_estimated_contents_loss(java.math.BigDecimal estimated_contents_loss) {
    this.estimated_contents_loss = estimated_contents_loss;
    return this;
  }
  private java.math.BigDecimal fire_fatalities;
  public java.math.BigDecimal get_fire_fatalities() {
    return fire_fatalities;
  }
  public void set_fire_fatalities(java.math.BigDecimal fire_fatalities) {
    this.fire_fatalities = fire_fatalities;
  }
  public incidents with_fire_fatalities(java.math.BigDecimal fire_fatalities) {
    this.fire_fatalities = fire_fatalities;
    return this;
  }
  private java.math.BigDecimal fire_injuries;
  public java.math.BigDecimal get_fire_injuries() {
    return fire_injuries;
  }
  public void set_fire_injuries(java.math.BigDecimal fire_injuries) {
    this.fire_injuries = fire_injuries;
  }
  public incidents with_fire_injuries(java.math.BigDecimal fire_injuries) {
    this.fire_injuries = fire_injuries;
    return this;
  }
  private java.math.BigDecimal civilian_fatalities;
  public java.math.BigDecimal get_civilian_fatalities() {
    return civilian_fatalities;
  }
  public void set_civilian_fatalities(java.math.BigDecimal civilian_fatalities) {
    this.civilian_fatalities = civilian_fatalities;
  }
  public incidents with_civilian_fatalities(java.math.BigDecimal civilian_fatalities) {
    this.civilian_fatalities = civilian_fatalities;
    return this;
  }
  private java.math.BigDecimal civilian_injuries;
  public java.math.BigDecimal get_civilian_injuries() {
    return civilian_injuries;
  }
  public void set_civilian_injuries(java.math.BigDecimal civilian_injuries) {
    this.civilian_injuries = civilian_injuries;
  }
  public incidents with_civilian_injuries(java.math.BigDecimal civilian_injuries) {
    this.civilian_injuries = civilian_injuries;
    return this;
  }
  private java.math.BigDecimal number_of_alarms;
  public java.math.BigDecimal get_number_of_alarms() {
    return number_of_alarms;
  }
  public void set_number_of_alarms(java.math.BigDecimal number_of_alarms) {
    this.number_of_alarms = number_of_alarms;
  }
  public incidents with_number_of_alarms(java.math.BigDecimal number_of_alarms) {
    this.number_of_alarms = number_of_alarms;
    return this;
  }
  private String primary_situation;
  public String get_primary_situation() {
    return primary_situation;
  }
  public void set_primary_situation(String primary_situation) {
    this.primary_situation = primary_situation;
  }
  public incidents with_primary_situation(String primary_situation) {
    this.primary_situation = primary_situation;
    return this;
  }
  private String mutual_aid;
  public String get_mutual_aid() {
    return mutual_aid;
  }
  public void set_mutual_aid(String mutual_aid) {
    this.mutual_aid = mutual_aid;
  }
  public incidents with_mutual_aid(String mutual_aid) {
    this.mutual_aid = mutual_aid;
    return this;
  }
  private String action_taken_primary;
  public String get_action_taken_primary() {
    return action_taken_primary;
  }
  public void set_action_taken_primary(String action_taken_primary) {
    this.action_taken_primary = action_taken_primary;
  }
  public incidents with_action_taken_primary(String action_taken_primary) {
    this.action_taken_primary = action_taken_primary;
    return this;
  }
  private String action_taken_secondary;
  public String get_action_taken_secondary() {
    return action_taken_secondary;
  }
  public void set_action_taken_secondary(String action_taken_secondary) {
    this.action_taken_secondary = action_taken_secondary;
  }
  public incidents with_action_taken_secondary(String action_taken_secondary) {
    this.action_taken_secondary = action_taken_secondary;
    return this;
  }
  private String action_taken_other;
  public String get_action_taken_other() {
    return action_taken_other;
  }
  public void set_action_taken_other(String action_taken_other) {
    this.action_taken_other = action_taken_other;
  }
  public incidents with_action_taken_other(String action_taken_other) {
    this.action_taken_other = action_taken_other;
    return this;
  }
  private String detector_alerted_occupants;
  public String get_detector_alerted_occupants() {
    return detector_alerted_occupants;
  }
  public void set_detector_alerted_occupants(String detector_alerted_occupants) {
    this.detector_alerted_occupants = detector_alerted_occupants;
  }
  public incidents with_detector_alerted_occupants(String detector_alerted_occupants) {
    this.detector_alerted_occupants = detector_alerted_occupants;
    return this;
  }
  private String property_use;
  public String get_property_use() {
    return property_use;
  }
  public void set_property_use(String property_use) {
    this.property_use = property_use;
  }
  public incidents with_property_use(String property_use) {
    this.property_use = property_use;
    return this;
  }
  private String area_of_fire_origin;
  public String get_area_of_fire_origin() {
    return area_of_fire_origin;
  }
  public void set_area_of_fire_origin(String area_of_fire_origin) {
    this.area_of_fire_origin = area_of_fire_origin;
  }
  public incidents with_area_of_fire_origin(String area_of_fire_origin) {
    this.area_of_fire_origin = area_of_fire_origin;
    return this;
  }
  private String ignition_cause;
  public String get_ignition_cause() {
    return ignition_cause;
  }
  public void set_ignition_cause(String ignition_cause) {
    this.ignition_cause = ignition_cause;
  }
  public incidents with_ignition_cause(String ignition_cause) {
    this.ignition_cause = ignition_cause;
    return this;
  }
  private String ignition_factor_primary;
  public String get_ignition_factor_primary() {
    return ignition_factor_primary;
  }
  public void set_ignition_factor_primary(String ignition_factor_primary) {
    this.ignition_factor_primary = ignition_factor_primary;
  }
  public incidents with_ignition_factor_primary(String ignition_factor_primary) {
    this.ignition_factor_primary = ignition_factor_primary;
    return this;
  }
  private String ignition_factor_secondary;
  public String get_ignition_factor_secondary() {
    return ignition_factor_secondary;
  }
  public void set_ignition_factor_secondary(String ignition_factor_secondary) {
    this.ignition_factor_secondary = ignition_factor_secondary;
  }
  public incidents with_ignition_factor_secondary(String ignition_factor_secondary) {
    this.ignition_factor_secondary = ignition_factor_secondary;
    return this;
  }
  private String heat_source;
  public String get_heat_source() {
    return heat_source;
  }
  public void set_heat_source(String heat_source) {
    this.heat_source = heat_source;
  }
  public incidents with_heat_source(String heat_source) {
    this.heat_source = heat_source;
    return this;
  }
  private String item_first_ignited;
  public String get_item_first_ignited() {
    return item_first_ignited;
  }
  public void set_item_first_ignited(String item_first_ignited) {
    this.item_first_ignited = item_first_ignited;
  }
  public incidents with_item_first_ignited(String item_first_ignited) {
    this.item_first_ignited = item_first_ignited;
    return this;
  }
  private String human_factors_associated_with_ignition;
  public String get_human_factors_associated_with_ignition() {
    return human_factors_associated_with_ignition;
  }
  public void set_human_factors_associated_with_ignition(String human_factors_associated_with_ignition) {
    this.human_factors_associated_with_ignition = human_factors_associated_with_ignition;
  }
  public incidents with_human_factors_associated_with_ignition(String human_factors_associated_with_ignition) {
    this.human_factors_associated_with_ignition = human_factors_associated_with_ignition;
    return this;
  }
  private String structure_type;
  public String get_structure_type() {
    return structure_type;
  }
  public void set_structure_type(String structure_type) {
    this.structure_type = structure_type;
  }
  public incidents with_structure_type(String structure_type) {
    this.structure_type = structure_type;
    return this;
  }
  private String structure_status;
  public String get_structure_status() {
    return structure_status;
  }
  public void set_structure_status(String structure_status) {
    this.structure_status = structure_status;
  }
  public incidents with_structure_status(String structure_status) {
    this.structure_status = structure_status;
    return this;
  }
  private java.math.BigDecimal floor_of_fire_origin;
  public java.math.BigDecimal get_floor_of_fire_origin() {
    return floor_of_fire_origin;
  }
  public void set_floor_of_fire_origin(java.math.BigDecimal floor_of_fire_origin) {
    this.floor_of_fire_origin = floor_of_fire_origin;
  }
  public incidents with_floor_of_fire_origin(java.math.BigDecimal floor_of_fire_origin) {
    this.floor_of_fire_origin = floor_of_fire_origin;
    return this;
  }
  private String fire_spread;
  public String get_fire_spread() {
    return fire_spread;
  }
  public void set_fire_spread(String fire_spread) {
    this.fire_spread = fire_spread;
  }
  public incidents with_fire_spread(String fire_spread) {
    this.fire_spread = fire_spread;
    return this;
  }
  private String no_flame_spread;
  public String get_no_flame_spread() {
    return no_flame_spread;
  }
  public void set_no_flame_spread(String no_flame_spread) {
    this.no_flame_spread = no_flame_spread;
  }
  public incidents with_no_flame_spread(String no_flame_spread) {
    this.no_flame_spread = no_flame_spread;
    return this;
  }
  private java.math.BigDecimal number_of_floors_with_minimum_damage;
  public java.math.BigDecimal get_number_of_floors_with_minimum_damage() {
    return number_of_floors_with_minimum_damage;
  }
  public void set_number_of_floors_with_minimum_damage(java.math.BigDecimal number_of_floors_with_minimum_damage) {
    this.number_of_floors_with_minimum_damage = number_of_floors_with_minimum_damage;
  }
  public incidents with_number_of_floors_with_minimum_damage(java.math.BigDecimal number_of_floors_with_minimum_damage) {
    this.number_of_floors_with_minimum_damage = number_of_floors_with_minimum_damage;
    return this;
  }
  private java.math.BigDecimal number_of_floors_with_significant_damage;
  public java.math.BigDecimal get_number_of_floors_with_significant_damage() {
    return number_of_floors_with_significant_damage;
  }
  public void set_number_of_floors_with_significant_damage(java.math.BigDecimal number_of_floors_with_significant_damage) {
    this.number_of_floors_with_significant_damage = number_of_floors_with_significant_damage;
  }
  public incidents with_number_of_floors_with_significant_damage(java.math.BigDecimal number_of_floors_with_significant_damage) {
    this.number_of_floors_with_significant_damage = number_of_floors_with_significant_damage;
    return this;
  }
  private java.math.BigDecimal number_of_floors_with_heavy_damage;
  public java.math.BigDecimal get_number_of_floors_with_heavy_damage() {
    return number_of_floors_with_heavy_damage;
  }
  public void set_number_of_floors_with_heavy_damage(java.math.BigDecimal number_of_floors_with_heavy_damage) {
    this.number_of_floors_with_heavy_damage = number_of_floors_with_heavy_damage;
  }
  public incidents with_number_of_floors_with_heavy_damage(java.math.BigDecimal number_of_floors_with_heavy_damage) {
    this.number_of_floors_with_heavy_damage = number_of_floors_with_heavy_damage;
    return this;
  }
  private java.math.BigDecimal number_of_floors_with_extreme_damage;
  public java.math.BigDecimal get_number_of_floors_with_extreme_damage() {
    return number_of_floors_with_extreme_damage;
  }
  public void set_number_of_floors_with_extreme_damage(java.math.BigDecimal number_of_floors_with_extreme_damage) {
    this.number_of_floors_with_extreme_damage = number_of_floors_with_extreme_damage;
  }
  public incidents with_number_of_floors_with_extreme_damage(java.math.BigDecimal number_of_floors_with_extreme_damage) {
    this.number_of_floors_with_extreme_damage = number_of_floors_with_extreme_damage;
    return this;
  }
  private String detectors_present;
  public String get_detectors_present() {
    return detectors_present;
  }
  public void set_detectors_present(String detectors_present) {
    this.detectors_present = detectors_present;
  }
  public incidents with_detectors_present(String detectors_present) {
    this.detectors_present = detectors_present;
    return this;
  }
  private String detector_type;
  public String get_detector_type() {
    return detector_type;
  }
  public void set_detector_type(String detector_type) {
    this.detector_type = detector_type;
  }
  public incidents with_detector_type(String detector_type) {
    this.detector_type = detector_type;
    return this;
  }
  private String detector_operation;
  public String get_detector_operation() {
    return detector_operation;
  }
  public void set_detector_operation(String detector_operation) {
    this.detector_operation = detector_operation;
  }
  public incidents with_detector_operation(String detector_operation) {
    this.detector_operation = detector_operation;
    return this;
  }
  private String detector_effectiveness;
  public String get_detector_effectiveness() {
    return detector_effectiveness;
  }
  public void set_detector_effectiveness(String detector_effectiveness) {
    this.detector_effectiveness = detector_effectiveness;
  }
  public incidents with_detector_effectiveness(String detector_effectiveness) {
    this.detector_effectiveness = detector_effectiveness;
    return this;
  }
  private String detector_failure_reason;
  public String get_detector_failure_reason() {
    return detector_failure_reason;
  }
  public void set_detector_failure_reason(String detector_failure_reason) {
    this.detector_failure_reason = detector_failure_reason;
  }
  public incidents with_detector_failure_reason(String detector_failure_reason) {
    this.detector_failure_reason = detector_failure_reason;
    return this;
  }
  private String automatic_extinguishing_system_present;
  public String get_automatic_extinguishing_system_present() {
    return automatic_extinguishing_system_present;
  }
  public void set_automatic_extinguishing_system_present(String automatic_extinguishing_system_present) {
    this.automatic_extinguishing_system_present = automatic_extinguishing_system_present;
  }
  public incidents with_automatic_extinguishing_system_present(String automatic_extinguishing_system_present) {
    this.automatic_extinguishing_system_present = automatic_extinguishing_system_present;
    return this;
  }
  private String automatic_extinguishing_sytem_type;
  public String get_automatic_extinguishing_sytem_type() {
    return automatic_extinguishing_sytem_type;
  }
  public void set_automatic_extinguishing_sytem_type(String automatic_extinguishing_sytem_type) {
    this.automatic_extinguishing_sytem_type = automatic_extinguishing_sytem_type;
  }
  public incidents with_automatic_extinguishing_sytem_type(String automatic_extinguishing_sytem_type) {
    this.automatic_extinguishing_sytem_type = automatic_extinguishing_sytem_type;
    return this;
  }
  private String automatic_extinguishing_sytem_perfomance;
  public String get_automatic_extinguishing_sytem_perfomance() {
    return automatic_extinguishing_sytem_perfomance;
  }
  public void set_automatic_extinguishing_sytem_perfomance(String automatic_extinguishing_sytem_perfomance) {
    this.automatic_extinguishing_sytem_perfomance = automatic_extinguishing_sytem_perfomance;
  }
  public incidents with_automatic_extinguishing_sytem_perfomance(String automatic_extinguishing_sytem_perfomance) {
    this.automatic_extinguishing_sytem_perfomance = automatic_extinguishing_sytem_perfomance;
    return this;
  }
  private String automatic_extinguishing_sytem_failure_reason;
  public String get_automatic_extinguishing_sytem_failure_reason() {
    return automatic_extinguishing_sytem_failure_reason;
  }
  public void set_automatic_extinguishing_sytem_failure_reason(String automatic_extinguishing_sytem_failure_reason) {
    this.automatic_extinguishing_sytem_failure_reason = automatic_extinguishing_sytem_failure_reason;
  }
  public incidents with_automatic_extinguishing_sytem_failure_reason(String automatic_extinguishing_sytem_failure_reason) {
    this.automatic_extinguishing_sytem_failure_reason = automatic_extinguishing_sytem_failure_reason;
    return this;
  }
  private java.math.BigDecimal number_of_sprinkler_heads_operating;
  public java.math.BigDecimal get_number_of_sprinkler_heads_operating() {
    return number_of_sprinkler_heads_operating;
  }
  public void set_number_of_sprinkler_heads_operating(java.math.BigDecimal number_of_sprinkler_heads_operating) {
    this.number_of_sprinkler_heads_operating = number_of_sprinkler_heads_operating;
  }
  public incidents with_number_of_sprinkler_heads_operating(java.math.BigDecimal number_of_sprinkler_heads_operating) {
    this.number_of_sprinkler_heads_operating = number_of_sprinkler_heads_operating;
    return this;
  }
  private String supervisor_district;
  public String get_supervisor_district() {
    return supervisor_district;
  }
  public void set_supervisor_district(String supervisor_district) {
    this.supervisor_district = supervisor_district;
  }
  public incidents with_supervisor_district(String supervisor_district) {
    this.supervisor_district = supervisor_district;
    return this;
  }
  private String neighborhood_district;
  public String get_neighborhood_district() {
    return neighborhood_district;
  }
  public void set_neighborhood_district(String neighborhood_district) {
    this.neighborhood_district = neighborhood_district;
  }
  public incidents with_neighborhood_district(String neighborhood_district) {
    this.neighborhood_district = neighborhood_district;
    return this;
  }
  private String point;
  public String get_point() {
    return point;
  }
  public void set_point(String point) {
    this.point = point;
  }
  public incidents with_point(String point) {
    this.point = point;
    return this;
  }
  private String data_as_of;
  public String get_data_as_of() {
    return data_as_of;
  }
  public void set_data_as_of(String data_as_of) {
    this.data_as_of = data_as_of;
  }
  public incidents with_data_as_of(String data_as_of) {
    this.data_as_of = data_as_of;
    return this;
  }
  private String data_loaded_at;
  public String get_data_loaded_at() {
    return data_loaded_at;
  }
  public void set_data_loaded_at(String data_loaded_at) {
    this.data_loaded_at = data_loaded_at;
  }
  public incidents with_data_loaded_at(String data_loaded_at) {
    this.data_loaded_at = data_loaded_at;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof incidents)) {
      return false;
    }
    incidents that = (incidents) o;
    boolean equal = true;
    equal = equal && (this.incident_number == null ? that.incident_number == null : this.incident_number.equals(that.incident_number));
    equal = equal && (this.exposure_number == null ? that.exposure_number == null : this.exposure_number.equals(that.exposure_number));
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.incident_date == null ? that.incident_date == null : this.incident_date.equals(that.incident_date));
    equal = equal && (this.call_number == null ? that.call_number == null : this.call_number.equals(that.call_number));
    equal = equal && (this.alarm_dttm == null ? that.alarm_dttm == null : this.alarm_dttm.equals(that.alarm_dttm));
    equal = equal && (this.arrival_dttm == null ? that.arrival_dttm == null : this.arrival_dttm.equals(that.arrival_dttm));
    equal = equal && (this.close_dttm == null ? that.close_dttm == null : this.close_dttm.equals(that.close_dttm));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.battalion == null ? that.battalion == null : this.battalion.equals(that.battalion));
    equal = equal && (this.station_area == null ? that.station_area == null : this.station_area.equals(that.station_area));
    equal = equal && (this.box == null ? that.box == null : this.box.equals(that.box));
    equal = equal && (this.suppression_units == null ? that.suppression_units == null : this.suppression_units.equals(that.suppression_units));
    equal = equal && (this.suppression_personnel == null ? that.suppression_personnel == null : this.suppression_personnel.equals(that.suppression_personnel));
    equal = equal && (this.ems_units == null ? that.ems_units == null : this.ems_units.equals(that.ems_units));
    equal = equal && (this.ems_personnel == null ? that.ems_personnel == null : this.ems_personnel.equals(that.ems_personnel));
    equal = equal && (this.other_units == null ? that.other_units == null : this.other_units.equals(that.other_units));
    equal = equal && (this.other_personnel == null ? that.other_personnel == null : this.other_personnel.equals(that.other_personnel));
    equal = equal && (this.first_unit_on_scene == null ? that.first_unit_on_scene == null : this.first_unit_on_scene.equals(that.first_unit_on_scene));
    equal = equal && (this.estimated_property_loss == null ? that.estimated_property_loss == null : this.estimated_property_loss.equals(that.estimated_property_loss));
    equal = equal && (this.estimated_contents_loss == null ? that.estimated_contents_loss == null : this.estimated_contents_loss.equals(that.estimated_contents_loss));
    equal = equal && (this.fire_fatalities == null ? that.fire_fatalities == null : this.fire_fatalities.equals(that.fire_fatalities));
    equal = equal && (this.fire_injuries == null ? that.fire_injuries == null : this.fire_injuries.equals(that.fire_injuries));
    equal = equal && (this.civilian_fatalities == null ? that.civilian_fatalities == null : this.civilian_fatalities.equals(that.civilian_fatalities));
    equal = equal && (this.civilian_injuries == null ? that.civilian_injuries == null : this.civilian_injuries.equals(that.civilian_injuries));
    equal = equal && (this.number_of_alarms == null ? that.number_of_alarms == null : this.number_of_alarms.equals(that.number_of_alarms));
    equal = equal && (this.primary_situation == null ? that.primary_situation == null : this.primary_situation.equals(that.primary_situation));
    equal = equal && (this.mutual_aid == null ? that.mutual_aid == null : this.mutual_aid.equals(that.mutual_aid));
    equal = equal && (this.action_taken_primary == null ? that.action_taken_primary == null : this.action_taken_primary.equals(that.action_taken_primary));
    equal = equal && (this.action_taken_secondary == null ? that.action_taken_secondary == null : this.action_taken_secondary.equals(that.action_taken_secondary));
    equal = equal && (this.action_taken_other == null ? that.action_taken_other == null : this.action_taken_other.equals(that.action_taken_other));
    equal = equal && (this.detector_alerted_occupants == null ? that.detector_alerted_occupants == null : this.detector_alerted_occupants.equals(that.detector_alerted_occupants));
    equal = equal && (this.property_use == null ? that.property_use == null : this.property_use.equals(that.property_use));
    equal = equal && (this.area_of_fire_origin == null ? that.area_of_fire_origin == null : this.area_of_fire_origin.equals(that.area_of_fire_origin));
    equal = equal && (this.ignition_cause == null ? that.ignition_cause == null : this.ignition_cause.equals(that.ignition_cause));
    equal = equal && (this.ignition_factor_primary == null ? that.ignition_factor_primary == null : this.ignition_factor_primary.equals(that.ignition_factor_primary));
    equal = equal && (this.ignition_factor_secondary == null ? that.ignition_factor_secondary == null : this.ignition_factor_secondary.equals(that.ignition_factor_secondary));
    equal = equal && (this.heat_source == null ? that.heat_source == null : this.heat_source.equals(that.heat_source));
    equal = equal && (this.item_first_ignited == null ? that.item_first_ignited == null : this.item_first_ignited.equals(that.item_first_ignited));
    equal = equal && (this.human_factors_associated_with_ignition == null ? that.human_factors_associated_with_ignition == null : this.human_factors_associated_with_ignition.equals(that.human_factors_associated_with_ignition));
    equal = equal && (this.structure_type == null ? that.structure_type == null : this.structure_type.equals(that.structure_type));
    equal = equal && (this.structure_status == null ? that.structure_status == null : this.structure_status.equals(that.structure_status));
    equal = equal && (this.floor_of_fire_origin == null ? that.floor_of_fire_origin == null : this.floor_of_fire_origin.equals(that.floor_of_fire_origin));
    equal = equal && (this.fire_spread == null ? that.fire_spread == null : this.fire_spread.equals(that.fire_spread));
    equal = equal && (this.no_flame_spread == null ? that.no_flame_spread == null : this.no_flame_spread.equals(that.no_flame_spread));
    equal = equal && (this.number_of_floors_with_minimum_damage == null ? that.number_of_floors_with_minimum_damage == null : this.number_of_floors_with_minimum_damage.equals(that.number_of_floors_with_minimum_damage));
    equal = equal && (this.number_of_floors_with_significant_damage == null ? that.number_of_floors_with_significant_damage == null : this.number_of_floors_with_significant_damage.equals(that.number_of_floors_with_significant_damage));
    equal = equal && (this.number_of_floors_with_heavy_damage == null ? that.number_of_floors_with_heavy_damage == null : this.number_of_floors_with_heavy_damage.equals(that.number_of_floors_with_heavy_damage));
    equal = equal && (this.number_of_floors_with_extreme_damage == null ? that.number_of_floors_with_extreme_damage == null : this.number_of_floors_with_extreme_damage.equals(that.number_of_floors_with_extreme_damage));
    equal = equal && (this.detectors_present == null ? that.detectors_present == null : this.detectors_present.equals(that.detectors_present));
    equal = equal && (this.detector_type == null ? that.detector_type == null : this.detector_type.equals(that.detector_type));
    equal = equal && (this.detector_operation == null ? that.detector_operation == null : this.detector_operation.equals(that.detector_operation));
    equal = equal && (this.detector_effectiveness == null ? that.detector_effectiveness == null : this.detector_effectiveness.equals(that.detector_effectiveness));
    equal = equal && (this.detector_failure_reason == null ? that.detector_failure_reason == null : this.detector_failure_reason.equals(that.detector_failure_reason));
    equal = equal && (this.automatic_extinguishing_system_present == null ? that.automatic_extinguishing_system_present == null : this.automatic_extinguishing_system_present.equals(that.automatic_extinguishing_system_present));
    equal = equal && (this.automatic_extinguishing_sytem_type == null ? that.automatic_extinguishing_sytem_type == null : this.automatic_extinguishing_sytem_type.equals(that.automatic_extinguishing_sytem_type));
    equal = equal && (this.automatic_extinguishing_sytem_perfomance == null ? that.automatic_extinguishing_sytem_perfomance == null : this.automatic_extinguishing_sytem_perfomance.equals(that.automatic_extinguishing_sytem_perfomance));
    equal = equal && (this.automatic_extinguishing_sytem_failure_reason == null ? that.automatic_extinguishing_sytem_failure_reason == null : this.automatic_extinguishing_sytem_failure_reason.equals(that.automatic_extinguishing_sytem_failure_reason));
    equal = equal && (this.number_of_sprinkler_heads_operating == null ? that.number_of_sprinkler_heads_operating == null : this.number_of_sprinkler_heads_operating.equals(that.number_of_sprinkler_heads_operating));
    equal = equal && (this.supervisor_district == null ? that.supervisor_district == null : this.supervisor_district.equals(that.supervisor_district));
    equal = equal && (this.neighborhood_district == null ? that.neighborhood_district == null : this.neighborhood_district.equals(that.neighborhood_district));
    equal = equal && (this.point == null ? that.point == null : this.point.equals(that.point));
    equal = equal && (this.data_as_of == null ? that.data_as_of == null : this.data_as_of.equals(that.data_as_of));
    equal = equal && (this.data_loaded_at == null ? that.data_loaded_at == null : this.data_loaded_at.equals(that.data_loaded_at));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof incidents)) {
      return false;
    }
    incidents that = (incidents) o;
    boolean equal = true;
    equal = equal && (this.incident_number == null ? that.incident_number == null : this.incident_number.equals(that.incident_number));
    equal = equal && (this.exposure_number == null ? that.exposure_number == null : this.exposure_number.equals(that.exposure_number));
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.incident_date == null ? that.incident_date == null : this.incident_date.equals(that.incident_date));
    equal = equal && (this.call_number == null ? that.call_number == null : this.call_number.equals(that.call_number));
    equal = equal && (this.alarm_dttm == null ? that.alarm_dttm == null : this.alarm_dttm.equals(that.alarm_dttm));
    equal = equal && (this.arrival_dttm == null ? that.arrival_dttm == null : this.arrival_dttm.equals(that.arrival_dttm));
    equal = equal && (this.close_dttm == null ? that.close_dttm == null : this.close_dttm.equals(that.close_dttm));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.battalion == null ? that.battalion == null : this.battalion.equals(that.battalion));
    equal = equal && (this.station_area == null ? that.station_area == null : this.station_area.equals(that.station_area));
    equal = equal && (this.box == null ? that.box == null : this.box.equals(that.box));
    equal = equal && (this.suppression_units == null ? that.suppression_units == null : this.suppression_units.equals(that.suppression_units));
    equal = equal && (this.suppression_personnel == null ? that.suppression_personnel == null : this.suppression_personnel.equals(that.suppression_personnel));
    equal = equal && (this.ems_units == null ? that.ems_units == null : this.ems_units.equals(that.ems_units));
    equal = equal && (this.ems_personnel == null ? that.ems_personnel == null : this.ems_personnel.equals(that.ems_personnel));
    equal = equal && (this.other_units == null ? that.other_units == null : this.other_units.equals(that.other_units));
    equal = equal && (this.other_personnel == null ? that.other_personnel == null : this.other_personnel.equals(that.other_personnel));
    equal = equal && (this.first_unit_on_scene == null ? that.first_unit_on_scene == null : this.first_unit_on_scene.equals(that.first_unit_on_scene));
    equal = equal && (this.estimated_property_loss == null ? that.estimated_property_loss == null : this.estimated_property_loss.equals(that.estimated_property_loss));
    equal = equal && (this.estimated_contents_loss == null ? that.estimated_contents_loss == null : this.estimated_contents_loss.equals(that.estimated_contents_loss));
    equal = equal && (this.fire_fatalities == null ? that.fire_fatalities == null : this.fire_fatalities.equals(that.fire_fatalities));
    equal = equal && (this.fire_injuries == null ? that.fire_injuries == null : this.fire_injuries.equals(that.fire_injuries));
    equal = equal && (this.civilian_fatalities == null ? that.civilian_fatalities == null : this.civilian_fatalities.equals(that.civilian_fatalities));
    equal = equal && (this.civilian_injuries == null ? that.civilian_injuries == null : this.civilian_injuries.equals(that.civilian_injuries));
    equal = equal && (this.number_of_alarms == null ? that.number_of_alarms == null : this.number_of_alarms.equals(that.number_of_alarms));
    equal = equal && (this.primary_situation == null ? that.primary_situation == null : this.primary_situation.equals(that.primary_situation));
    equal = equal && (this.mutual_aid == null ? that.mutual_aid == null : this.mutual_aid.equals(that.mutual_aid));
    equal = equal && (this.action_taken_primary == null ? that.action_taken_primary == null : this.action_taken_primary.equals(that.action_taken_primary));
    equal = equal && (this.action_taken_secondary == null ? that.action_taken_secondary == null : this.action_taken_secondary.equals(that.action_taken_secondary));
    equal = equal && (this.action_taken_other == null ? that.action_taken_other == null : this.action_taken_other.equals(that.action_taken_other));
    equal = equal && (this.detector_alerted_occupants == null ? that.detector_alerted_occupants == null : this.detector_alerted_occupants.equals(that.detector_alerted_occupants));
    equal = equal && (this.property_use == null ? that.property_use == null : this.property_use.equals(that.property_use));
    equal = equal && (this.area_of_fire_origin == null ? that.area_of_fire_origin == null : this.area_of_fire_origin.equals(that.area_of_fire_origin));
    equal = equal && (this.ignition_cause == null ? that.ignition_cause == null : this.ignition_cause.equals(that.ignition_cause));
    equal = equal && (this.ignition_factor_primary == null ? that.ignition_factor_primary == null : this.ignition_factor_primary.equals(that.ignition_factor_primary));
    equal = equal && (this.ignition_factor_secondary == null ? that.ignition_factor_secondary == null : this.ignition_factor_secondary.equals(that.ignition_factor_secondary));
    equal = equal && (this.heat_source == null ? that.heat_source == null : this.heat_source.equals(that.heat_source));
    equal = equal && (this.item_first_ignited == null ? that.item_first_ignited == null : this.item_first_ignited.equals(that.item_first_ignited));
    equal = equal && (this.human_factors_associated_with_ignition == null ? that.human_factors_associated_with_ignition == null : this.human_factors_associated_with_ignition.equals(that.human_factors_associated_with_ignition));
    equal = equal && (this.structure_type == null ? that.structure_type == null : this.structure_type.equals(that.structure_type));
    equal = equal && (this.structure_status == null ? that.structure_status == null : this.structure_status.equals(that.structure_status));
    equal = equal && (this.floor_of_fire_origin == null ? that.floor_of_fire_origin == null : this.floor_of_fire_origin.equals(that.floor_of_fire_origin));
    equal = equal && (this.fire_spread == null ? that.fire_spread == null : this.fire_spread.equals(that.fire_spread));
    equal = equal && (this.no_flame_spread == null ? that.no_flame_spread == null : this.no_flame_spread.equals(that.no_flame_spread));
    equal = equal && (this.number_of_floors_with_minimum_damage == null ? that.number_of_floors_with_minimum_damage == null : this.number_of_floors_with_minimum_damage.equals(that.number_of_floors_with_minimum_damage));
    equal = equal && (this.number_of_floors_with_significant_damage == null ? that.number_of_floors_with_significant_damage == null : this.number_of_floors_with_significant_damage.equals(that.number_of_floors_with_significant_damage));
    equal = equal && (this.number_of_floors_with_heavy_damage == null ? that.number_of_floors_with_heavy_damage == null : this.number_of_floors_with_heavy_damage.equals(that.number_of_floors_with_heavy_damage));
    equal = equal && (this.number_of_floors_with_extreme_damage == null ? that.number_of_floors_with_extreme_damage == null : this.number_of_floors_with_extreme_damage.equals(that.number_of_floors_with_extreme_damage));
    equal = equal && (this.detectors_present == null ? that.detectors_present == null : this.detectors_present.equals(that.detectors_present));
    equal = equal && (this.detector_type == null ? that.detector_type == null : this.detector_type.equals(that.detector_type));
    equal = equal && (this.detector_operation == null ? that.detector_operation == null : this.detector_operation.equals(that.detector_operation));
    equal = equal && (this.detector_effectiveness == null ? that.detector_effectiveness == null : this.detector_effectiveness.equals(that.detector_effectiveness));
    equal = equal && (this.detector_failure_reason == null ? that.detector_failure_reason == null : this.detector_failure_reason.equals(that.detector_failure_reason));
    equal = equal && (this.automatic_extinguishing_system_present == null ? that.automatic_extinguishing_system_present == null : this.automatic_extinguishing_system_present.equals(that.automatic_extinguishing_system_present));
    equal = equal && (this.automatic_extinguishing_sytem_type == null ? that.automatic_extinguishing_sytem_type == null : this.automatic_extinguishing_sytem_type.equals(that.automatic_extinguishing_sytem_type));
    equal = equal && (this.automatic_extinguishing_sytem_perfomance == null ? that.automatic_extinguishing_sytem_perfomance == null : this.automatic_extinguishing_sytem_perfomance.equals(that.automatic_extinguishing_sytem_perfomance));
    equal = equal && (this.automatic_extinguishing_sytem_failure_reason == null ? that.automatic_extinguishing_sytem_failure_reason == null : this.automatic_extinguishing_sytem_failure_reason.equals(that.automatic_extinguishing_sytem_failure_reason));
    equal = equal && (this.number_of_sprinkler_heads_operating == null ? that.number_of_sprinkler_heads_operating == null : this.number_of_sprinkler_heads_operating.equals(that.number_of_sprinkler_heads_operating));
    equal = equal && (this.supervisor_district == null ? that.supervisor_district == null : this.supervisor_district.equals(that.supervisor_district));
    equal = equal && (this.neighborhood_district == null ? that.neighborhood_district == null : this.neighborhood_district.equals(that.neighborhood_district));
    equal = equal && (this.point == null ? that.point == null : this.point.equals(that.point));
    equal = equal && (this.data_as_of == null ? that.data_as_of == null : this.data_as_of.equals(that.data_as_of));
    equal = equal && (this.data_loaded_at == null ? that.data_loaded_at == null : this.data_loaded_at.equals(that.data_loaded_at));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.incident_number = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.exposure_number = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.id = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.address = JdbcWritableBridge.readString(4, __dbResults);
    this.incident_date = JdbcWritableBridge.readString(5, __dbResults);
    this.call_number = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.alarm_dttm = JdbcWritableBridge.readString(7, __dbResults);
    this.arrival_dttm = JdbcWritableBridge.readString(8, __dbResults);
    this.close_dttm = JdbcWritableBridge.readString(9, __dbResults);
    this.city = JdbcWritableBridge.readString(10, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(11, __dbResults);
    this.battalion = JdbcWritableBridge.readString(12, __dbResults);
    this.station_area = JdbcWritableBridge.readString(13, __dbResults);
    this.box = JdbcWritableBridge.readString(14, __dbResults);
    this.suppression_units = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.suppression_personnel = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.ems_units = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.ems_personnel = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.other_units = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.other_personnel = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.first_unit_on_scene = JdbcWritableBridge.readString(21, __dbResults);
    this.estimated_property_loss = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.estimated_contents_loss = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fire_fatalities = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fire_injuries = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.civilian_fatalities = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.civilian_injuries = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.number_of_alarms = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.primary_situation = JdbcWritableBridge.readString(29, __dbResults);
    this.mutual_aid = JdbcWritableBridge.readString(30, __dbResults);
    this.action_taken_primary = JdbcWritableBridge.readString(31, __dbResults);
    this.action_taken_secondary = JdbcWritableBridge.readString(32, __dbResults);
    this.action_taken_other = JdbcWritableBridge.readString(33, __dbResults);
    this.detector_alerted_occupants = JdbcWritableBridge.readString(34, __dbResults);
    this.property_use = JdbcWritableBridge.readString(35, __dbResults);
    this.area_of_fire_origin = JdbcWritableBridge.readString(36, __dbResults);
    this.ignition_cause = JdbcWritableBridge.readString(37, __dbResults);
    this.ignition_factor_primary = JdbcWritableBridge.readString(38, __dbResults);
    this.ignition_factor_secondary = JdbcWritableBridge.readString(39, __dbResults);
    this.heat_source = JdbcWritableBridge.readString(40, __dbResults);
    this.item_first_ignited = JdbcWritableBridge.readString(41, __dbResults);
    this.human_factors_associated_with_ignition = JdbcWritableBridge.readString(42, __dbResults);
    this.structure_type = JdbcWritableBridge.readString(43, __dbResults);
    this.structure_status = JdbcWritableBridge.readString(44, __dbResults);
    this.floor_of_fire_origin = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fire_spread = JdbcWritableBridge.readString(46, __dbResults);
    this.no_flame_spread = JdbcWritableBridge.readString(47, __dbResults);
    this.number_of_floors_with_minimum_damage = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.number_of_floors_with_significant_damage = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.number_of_floors_with_heavy_damage = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.number_of_floors_with_extreme_damage = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.detectors_present = JdbcWritableBridge.readString(52, __dbResults);
    this.detector_type = JdbcWritableBridge.readString(53, __dbResults);
    this.detector_operation = JdbcWritableBridge.readString(54, __dbResults);
    this.detector_effectiveness = JdbcWritableBridge.readString(55, __dbResults);
    this.detector_failure_reason = JdbcWritableBridge.readString(56, __dbResults);
    this.automatic_extinguishing_system_present = JdbcWritableBridge.readString(57, __dbResults);
    this.automatic_extinguishing_sytem_type = JdbcWritableBridge.readString(58, __dbResults);
    this.automatic_extinguishing_sytem_perfomance = JdbcWritableBridge.readString(59, __dbResults);
    this.automatic_extinguishing_sytem_failure_reason = JdbcWritableBridge.readString(60, __dbResults);
    this.number_of_sprinkler_heads_operating = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.supervisor_district = JdbcWritableBridge.readString(62, __dbResults);
    this.neighborhood_district = JdbcWritableBridge.readString(63, __dbResults);
    this.point = JdbcWritableBridge.readString(64, __dbResults);
    this.data_as_of = JdbcWritableBridge.readString(65, __dbResults);
    this.data_loaded_at = JdbcWritableBridge.readString(66, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.incident_number = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.exposure_number = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.id = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.address = JdbcWritableBridge.readString(4, __dbResults);
    this.incident_date = JdbcWritableBridge.readString(5, __dbResults);
    this.call_number = JdbcWritableBridge.readBigDecimal(6, __dbResults);
    this.alarm_dttm = JdbcWritableBridge.readString(7, __dbResults);
    this.arrival_dttm = JdbcWritableBridge.readString(8, __dbResults);
    this.close_dttm = JdbcWritableBridge.readString(9, __dbResults);
    this.city = JdbcWritableBridge.readString(10, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(11, __dbResults);
    this.battalion = JdbcWritableBridge.readString(12, __dbResults);
    this.station_area = JdbcWritableBridge.readString(13, __dbResults);
    this.box = JdbcWritableBridge.readString(14, __dbResults);
    this.suppression_units = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.suppression_personnel = JdbcWritableBridge.readBigDecimal(16, __dbResults);
    this.ems_units = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.ems_personnel = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.other_units = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.other_personnel = JdbcWritableBridge.readBigDecimal(20, __dbResults);
    this.first_unit_on_scene = JdbcWritableBridge.readString(21, __dbResults);
    this.estimated_property_loss = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.estimated_contents_loss = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.fire_fatalities = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.fire_injuries = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.civilian_fatalities = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.civilian_injuries = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.number_of_alarms = JdbcWritableBridge.readBigDecimal(28, __dbResults);
    this.primary_situation = JdbcWritableBridge.readString(29, __dbResults);
    this.mutual_aid = JdbcWritableBridge.readString(30, __dbResults);
    this.action_taken_primary = JdbcWritableBridge.readString(31, __dbResults);
    this.action_taken_secondary = JdbcWritableBridge.readString(32, __dbResults);
    this.action_taken_other = JdbcWritableBridge.readString(33, __dbResults);
    this.detector_alerted_occupants = JdbcWritableBridge.readString(34, __dbResults);
    this.property_use = JdbcWritableBridge.readString(35, __dbResults);
    this.area_of_fire_origin = JdbcWritableBridge.readString(36, __dbResults);
    this.ignition_cause = JdbcWritableBridge.readString(37, __dbResults);
    this.ignition_factor_primary = JdbcWritableBridge.readString(38, __dbResults);
    this.ignition_factor_secondary = JdbcWritableBridge.readString(39, __dbResults);
    this.heat_source = JdbcWritableBridge.readString(40, __dbResults);
    this.item_first_ignited = JdbcWritableBridge.readString(41, __dbResults);
    this.human_factors_associated_with_ignition = JdbcWritableBridge.readString(42, __dbResults);
    this.structure_type = JdbcWritableBridge.readString(43, __dbResults);
    this.structure_status = JdbcWritableBridge.readString(44, __dbResults);
    this.floor_of_fire_origin = JdbcWritableBridge.readBigDecimal(45, __dbResults);
    this.fire_spread = JdbcWritableBridge.readString(46, __dbResults);
    this.no_flame_spread = JdbcWritableBridge.readString(47, __dbResults);
    this.number_of_floors_with_minimum_damage = JdbcWritableBridge.readBigDecimal(48, __dbResults);
    this.number_of_floors_with_significant_damage = JdbcWritableBridge.readBigDecimal(49, __dbResults);
    this.number_of_floors_with_heavy_damage = JdbcWritableBridge.readBigDecimal(50, __dbResults);
    this.number_of_floors_with_extreme_damage = JdbcWritableBridge.readBigDecimal(51, __dbResults);
    this.detectors_present = JdbcWritableBridge.readString(52, __dbResults);
    this.detector_type = JdbcWritableBridge.readString(53, __dbResults);
    this.detector_operation = JdbcWritableBridge.readString(54, __dbResults);
    this.detector_effectiveness = JdbcWritableBridge.readString(55, __dbResults);
    this.detector_failure_reason = JdbcWritableBridge.readString(56, __dbResults);
    this.automatic_extinguishing_system_present = JdbcWritableBridge.readString(57, __dbResults);
    this.automatic_extinguishing_sytem_type = JdbcWritableBridge.readString(58, __dbResults);
    this.automatic_extinguishing_sytem_perfomance = JdbcWritableBridge.readString(59, __dbResults);
    this.automatic_extinguishing_sytem_failure_reason = JdbcWritableBridge.readString(60, __dbResults);
    this.number_of_sprinkler_heads_operating = JdbcWritableBridge.readBigDecimal(61, __dbResults);
    this.supervisor_district = JdbcWritableBridge.readString(62, __dbResults);
    this.neighborhood_district = JdbcWritableBridge.readString(63, __dbResults);
    this.point = JdbcWritableBridge.readString(64, __dbResults);
    this.data_as_of = JdbcWritableBridge.readString(65, __dbResults);
    this.data_loaded_at = JdbcWritableBridge.readString(66, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(incident_number, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(exposure_number, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(id, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(address, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(incident_date, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(call_number, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(alarm_dttm, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(arrival_dttm, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(close_dttm, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(battalion, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(station_area, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(box, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(suppression_units, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(suppression_personnel, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ems_units, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ems_personnel, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(other_units, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(other_personnel, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(first_unit_on_scene, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(estimated_property_loss, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(estimated_contents_loss, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fire_fatalities, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fire_injuries, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(civilian_fatalities, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(civilian_injuries, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_alarms, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(primary_situation, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mutual_aid, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(action_taken_primary, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(action_taken_secondary, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(action_taken_other, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_alerted_occupants, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property_use, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_of_fire_origin, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ignition_cause, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ignition_factor_primary, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ignition_factor_secondary, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(heat_source, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(item_first_ignited, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(human_factors_associated_with_ignition, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(structure_type, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(structure_status, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(floor_of_fire_origin, 45 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(fire_spread, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(no_flame_spread, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_minimum_damage, 48 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_significant_damage, 49 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_heavy_damage, 50 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_extreme_damage, 51 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(detectors_present, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_type, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_operation, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_effectiveness, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_failure_reason, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_system_present, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_sytem_type, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_sytem_perfomance, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_sytem_failure_reason, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_sprinkler_heads_operating, 61 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(supervisor_district, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighborhood_district, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(point, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(data_as_of, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(data_loaded_at, 66 + __off, 12, __dbStmt);
    return 66;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(incident_number, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(exposure_number, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(id, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(address, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(incident_date, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(call_number, 6 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(alarm_dttm, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(arrival_dttm, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(close_dttm, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(battalion, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(station_area, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(box, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(suppression_units, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(suppression_personnel, 16 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ems_units, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ems_personnel, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(other_units, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(other_personnel, 20 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(first_unit_on_scene, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(estimated_property_loss, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(estimated_contents_loss, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fire_fatalities, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(fire_injuries, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(civilian_fatalities, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(civilian_injuries, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_alarms, 28 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(primary_situation, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mutual_aid, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(action_taken_primary, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(action_taken_secondary, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(action_taken_other, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_alerted_occupants, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property_use, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area_of_fire_origin, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ignition_cause, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ignition_factor_primary, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ignition_factor_secondary, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(heat_source, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(item_first_ignited, 41 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(human_factors_associated_with_ignition, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(structure_type, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(structure_status, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(floor_of_fire_origin, 45 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(fire_spread, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(no_flame_spread, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_minimum_damage, 48 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_significant_damage, 49 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_heavy_damage, 50 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_floors_with_extreme_damage, 51 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(detectors_present, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_type, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_operation, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_effectiveness, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(detector_failure_reason, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_system_present, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_sytem_type, 58 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_sytem_perfomance, 59 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(automatic_extinguishing_sytem_failure_reason, 60 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(number_of_sprinkler_heads_operating, 61 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(supervisor_district, 62 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(neighborhood_district, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(point, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(data_as_of, 65 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(data_loaded_at, 66 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.incident_number = null;
    } else {
    this.incident_number = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.exposure_number = null;
    } else {
    this.exposure_number = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.incident_date = null;
    } else {
    this.incident_date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.call_number = null;
    } else {
    this.call_number = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.alarm_dttm = null;
    } else {
    this.alarm_dttm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.arrival_dttm = null;
    } else {
    this.arrival_dttm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.close_dttm = null;
    } else {
    this.close_dttm = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zipcode = null;
    } else {
    this.zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.battalion = null;
    } else {
    this.battalion = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.station_area = null;
    } else {
    this.station_area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.box = null;
    } else {
    this.box = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.suppression_units = null;
    } else {
    this.suppression_units = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.suppression_personnel = null;
    } else {
    this.suppression_personnel = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ems_units = null;
    } else {
    this.ems_units = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ems_personnel = null;
    } else {
    this.ems_personnel = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other_units = null;
    } else {
    this.other_units = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other_personnel = null;
    } else {
    this.other_personnel = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.first_unit_on_scene = null;
    } else {
    this.first_unit_on_scene = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.estimated_property_loss = null;
    } else {
    this.estimated_property_loss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.estimated_contents_loss = null;
    } else {
    this.estimated_contents_loss = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fire_fatalities = null;
    } else {
    this.fire_fatalities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fire_injuries = null;
    } else {
    this.fire_injuries = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.civilian_fatalities = null;
    } else {
    this.civilian_fatalities = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.civilian_injuries = null;
    } else {
    this.civilian_injuries = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_alarms = null;
    } else {
    this.number_of_alarms = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.primary_situation = null;
    } else {
    this.primary_situation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mutual_aid = null;
    } else {
    this.mutual_aid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.action_taken_primary = null;
    } else {
    this.action_taken_primary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.action_taken_secondary = null;
    } else {
    this.action_taken_secondary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.action_taken_other = null;
    } else {
    this.action_taken_other = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.detector_alerted_occupants = null;
    } else {
    this.detector_alerted_occupants = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.property_use = null;
    } else {
    this.property_use = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.area_of_fire_origin = null;
    } else {
    this.area_of_fire_origin = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ignition_cause = null;
    } else {
    this.ignition_cause = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ignition_factor_primary = null;
    } else {
    this.ignition_factor_primary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ignition_factor_secondary = null;
    } else {
    this.ignition_factor_secondary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.heat_source = null;
    } else {
    this.heat_source = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.item_first_ignited = null;
    } else {
    this.item_first_ignited = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.human_factors_associated_with_ignition = null;
    } else {
    this.human_factors_associated_with_ignition = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.structure_type = null;
    } else {
    this.structure_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.structure_status = null;
    } else {
    this.structure_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.floor_of_fire_origin = null;
    } else {
    this.floor_of_fire_origin = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fire_spread = null;
    } else {
    this.fire_spread = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.no_flame_spread = null;
    } else {
    this.no_flame_spread = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_floors_with_minimum_damage = null;
    } else {
    this.number_of_floors_with_minimum_damage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_floors_with_significant_damage = null;
    } else {
    this.number_of_floors_with_significant_damage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_floors_with_heavy_damage = null;
    } else {
    this.number_of_floors_with_heavy_damage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_floors_with_extreme_damage = null;
    } else {
    this.number_of_floors_with_extreme_damage = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.detectors_present = null;
    } else {
    this.detectors_present = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.detector_type = null;
    } else {
    this.detector_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.detector_operation = null;
    } else {
    this.detector_operation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.detector_effectiveness = null;
    } else {
    this.detector_effectiveness = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.detector_failure_reason = null;
    } else {
    this.detector_failure_reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.automatic_extinguishing_system_present = null;
    } else {
    this.automatic_extinguishing_system_present = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.automatic_extinguishing_sytem_type = null;
    } else {
    this.automatic_extinguishing_sytem_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.automatic_extinguishing_sytem_perfomance = null;
    } else {
    this.automatic_extinguishing_sytem_perfomance = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.automatic_extinguishing_sytem_failure_reason = null;
    } else {
    this.automatic_extinguishing_sytem_failure_reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_sprinkler_heads_operating = null;
    } else {
    this.number_of_sprinkler_heads_operating = org.apache.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.supervisor_district = null;
    } else {
    this.supervisor_district = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.neighborhood_district = null;
    } else {
    this.neighborhood_district = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.point = null;
    } else {
    this.point = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.data_as_of = null;
    } else {
    this.data_as_of = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.data_loaded_at = null;
    } else {
    this.data_loaded_at = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.incident_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.incident_number, __dataOut);
    }
    if (null == this.exposure_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.exposure_number, __dataOut);
    }
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.id, __dataOut);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.incident_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_date);
    }
    if (null == this.call_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.call_number, __dataOut);
    }
    if (null == this.alarm_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, alarm_dttm);
    }
    if (null == this.arrival_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, arrival_dttm);
    }
    if (null == this.close_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, close_dttm);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.battalion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, battalion);
    }
    if (null == this.station_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station_area);
    }
    if (null == this.box) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, box);
    }
    if (null == this.suppression_units) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.suppression_units, __dataOut);
    }
    if (null == this.suppression_personnel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.suppression_personnel, __dataOut);
    }
    if (null == this.ems_units) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ems_units, __dataOut);
    }
    if (null == this.ems_personnel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ems_personnel, __dataOut);
    }
    if (null == this.other_units) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.other_units, __dataOut);
    }
    if (null == this.other_personnel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.other_personnel, __dataOut);
    }
    if (null == this.first_unit_on_scene) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_unit_on_scene);
    }
    if (null == this.estimated_property_loss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.estimated_property_loss, __dataOut);
    }
    if (null == this.estimated_contents_loss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.estimated_contents_loss, __dataOut);
    }
    if (null == this.fire_fatalities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fire_fatalities, __dataOut);
    }
    if (null == this.fire_injuries) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fire_injuries, __dataOut);
    }
    if (null == this.civilian_fatalities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.civilian_fatalities, __dataOut);
    }
    if (null == this.civilian_injuries) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.civilian_injuries, __dataOut);
    }
    if (null == this.number_of_alarms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_alarms, __dataOut);
    }
    if (null == this.primary_situation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, primary_situation);
    }
    if (null == this.mutual_aid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mutual_aid);
    }
    if (null == this.action_taken_primary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, action_taken_primary);
    }
    if (null == this.action_taken_secondary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, action_taken_secondary);
    }
    if (null == this.action_taken_other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, action_taken_other);
    }
    if (null == this.detector_alerted_occupants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_alerted_occupants);
    }
    if (null == this.property_use) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property_use);
    }
    if (null == this.area_of_fire_origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_of_fire_origin);
    }
    if (null == this.ignition_cause) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ignition_cause);
    }
    if (null == this.ignition_factor_primary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ignition_factor_primary);
    }
    if (null == this.ignition_factor_secondary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ignition_factor_secondary);
    }
    if (null == this.heat_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, heat_source);
    }
    if (null == this.item_first_ignited) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, item_first_ignited);
    }
    if (null == this.human_factors_associated_with_ignition) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, human_factors_associated_with_ignition);
    }
    if (null == this.structure_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, structure_type);
    }
    if (null == this.structure_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, structure_status);
    }
    if (null == this.floor_of_fire_origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.floor_of_fire_origin, __dataOut);
    }
    if (null == this.fire_spread) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fire_spread);
    }
    if (null == this.no_flame_spread) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, no_flame_spread);
    }
    if (null == this.number_of_floors_with_minimum_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_minimum_damage, __dataOut);
    }
    if (null == this.number_of_floors_with_significant_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_significant_damage, __dataOut);
    }
    if (null == this.number_of_floors_with_heavy_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_heavy_damage, __dataOut);
    }
    if (null == this.number_of_floors_with_extreme_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_extreme_damage, __dataOut);
    }
    if (null == this.detectors_present) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detectors_present);
    }
    if (null == this.detector_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_type);
    }
    if (null == this.detector_operation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_operation);
    }
    if (null == this.detector_effectiveness) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_effectiveness);
    }
    if (null == this.detector_failure_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_failure_reason);
    }
    if (null == this.automatic_extinguishing_system_present) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_system_present);
    }
    if (null == this.automatic_extinguishing_sytem_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_sytem_type);
    }
    if (null == this.automatic_extinguishing_sytem_perfomance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_sytem_perfomance);
    }
    if (null == this.automatic_extinguishing_sytem_failure_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_sytem_failure_reason);
    }
    if (null == this.number_of_sprinkler_heads_operating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_sprinkler_heads_operating, __dataOut);
    }
    if (null == this.supervisor_district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supervisor_district);
    }
    if (null == this.neighborhood_district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighborhood_district);
    }
    if (null == this.point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, point);
    }
    if (null == this.data_as_of) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, data_as_of);
    }
    if (null == this.data_loaded_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, data_loaded_at);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.incident_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.incident_number, __dataOut);
    }
    if (null == this.exposure_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.exposure_number, __dataOut);
    }
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.id, __dataOut);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.incident_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, incident_date);
    }
    if (null == this.call_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.call_number, __dataOut);
    }
    if (null == this.alarm_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, alarm_dttm);
    }
    if (null == this.arrival_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, arrival_dttm);
    }
    if (null == this.close_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, close_dttm);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.battalion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, battalion);
    }
    if (null == this.station_area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station_area);
    }
    if (null == this.box) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, box);
    }
    if (null == this.suppression_units) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.suppression_units, __dataOut);
    }
    if (null == this.suppression_personnel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.suppression_personnel, __dataOut);
    }
    if (null == this.ems_units) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ems_units, __dataOut);
    }
    if (null == this.ems_personnel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.ems_personnel, __dataOut);
    }
    if (null == this.other_units) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.other_units, __dataOut);
    }
    if (null == this.other_personnel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.other_personnel, __dataOut);
    }
    if (null == this.first_unit_on_scene) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, first_unit_on_scene);
    }
    if (null == this.estimated_property_loss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.estimated_property_loss, __dataOut);
    }
    if (null == this.estimated_contents_loss) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.estimated_contents_loss, __dataOut);
    }
    if (null == this.fire_fatalities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fire_fatalities, __dataOut);
    }
    if (null == this.fire_injuries) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.fire_injuries, __dataOut);
    }
    if (null == this.civilian_fatalities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.civilian_fatalities, __dataOut);
    }
    if (null == this.civilian_injuries) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.civilian_injuries, __dataOut);
    }
    if (null == this.number_of_alarms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_alarms, __dataOut);
    }
    if (null == this.primary_situation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, primary_situation);
    }
    if (null == this.mutual_aid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mutual_aid);
    }
    if (null == this.action_taken_primary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, action_taken_primary);
    }
    if (null == this.action_taken_secondary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, action_taken_secondary);
    }
    if (null == this.action_taken_other) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, action_taken_other);
    }
    if (null == this.detector_alerted_occupants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_alerted_occupants);
    }
    if (null == this.property_use) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property_use);
    }
    if (null == this.area_of_fire_origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area_of_fire_origin);
    }
    if (null == this.ignition_cause) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ignition_cause);
    }
    if (null == this.ignition_factor_primary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ignition_factor_primary);
    }
    if (null == this.ignition_factor_secondary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ignition_factor_secondary);
    }
    if (null == this.heat_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, heat_source);
    }
    if (null == this.item_first_ignited) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, item_first_ignited);
    }
    if (null == this.human_factors_associated_with_ignition) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, human_factors_associated_with_ignition);
    }
    if (null == this.structure_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, structure_type);
    }
    if (null == this.structure_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, structure_status);
    }
    if (null == this.floor_of_fire_origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.floor_of_fire_origin, __dataOut);
    }
    if (null == this.fire_spread) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fire_spread);
    }
    if (null == this.no_flame_spread) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, no_flame_spread);
    }
    if (null == this.number_of_floors_with_minimum_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_minimum_damage, __dataOut);
    }
    if (null == this.number_of_floors_with_significant_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_significant_damage, __dataOut);
    }
    if (null == this.number_of_floors_with_heavy_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_heavy_damage, __dataOut);
    }
    if (null == this.number_of_floors_with_extreme_damage) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_floors_with_extreme_damage, __dataOut);
    }
    if (null == this.detectors_present) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detectors_present);
    }
    if (null == this.detector_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_type);
    }
    if (null == this.detector_operation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_operation);
    }
    if (null == this.detector_effectiveness) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_effectiveness);
    }
    if (null == this.detector_failure_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, detector_failure_reason);
    }
    if (null == this.automatic_extinguishing_system_present) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_system_present);
    }
    if (null == this.automatic_extinguishing_sytem_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_sytem_type);
    }
    if (null == this.automatic_extinguishing_sytem_perfomance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_sytem_perfomance);
    }
    if (null == this.automatic_extinguishing_sytem_failure_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, automatic_extinguishing_sytem_failure_reason);
    }
    if (null == this.number_of_sprinkler_heads_operating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    org.apache.sqoop.lib.BigDecimalSerializer.write(this.number_of_sprinkler_heads_operating, __dataOut);
    }
    if (null == this.supervisor_district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, supervisor_district);
    }
    if (null == this.neighborhood_district) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighborhood_district);
    }
    if (null == this.point) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, point);
    }
    if (null == this.data_as_of) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, data_as_of);
    }
    if (null == this.data_loaded_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, data_loaded_at);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(incident_number==null?"null":incident_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(exposure_number==null?"null":exposure_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_date==null?"null":incident_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(call_number==null?"null":call_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(alarm_dttm==null?"null":alarm_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_dttm==null?"null":arrival_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close_dttm==null?"null":close_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(battalion==null?"null":battalion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(station_area==null?"null":station_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(box==null?"null":box, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(suppression_units==null?"null":suppression_units.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(suppression_personnel==null?"null":suppression_personnel.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ems_units==null?"null":ems_units.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ems_personnel==null?"null":ems_personnel.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_units==null?"null":other_units.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_personnel==null?"null":other_personnel.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_unit_on_scene==null?"null":first_unit_on_scene, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estimated_property_loss==null?"null":estimated_property_loss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estimated_contents_loss==null?"null":estimated_contents_loss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fire_fatalities==null?"null":fire_fatalities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fire_injuries==null?"null":fire_injuries.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(civilian_fatalities==null?"null":civilian_fatalities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(civilian_injuries==null?"null":civilian_injuries.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_alarms==null?"null":number_of_alarms.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(primary_situation==null?"null":primary_situation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mutual_aid==null?"null":mutual_aid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(action_taken_primary==null?"null":action_taken_primary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(action_taken_secondary==null?"null":action_taken_secondary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(action_taken_other==null?"null":action_taken_other, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_alerted_occupants==null?"null":detector_alerted_occupants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property_use==null?"null":property_use, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_of_fire_origin==null?"null":area_of_fire_origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ignition_cause==null?"null":ignition_cause, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ignition_factor_primary==null?"null":ignition_factor_primary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ignition_factor_secondary==null?"null":ignition_factor_secondary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(heat_source==null?"null":heat_source, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(item_first_ignited==null?"null":item_first_ignited, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(human_factors_associated_with_ignition==null?"null":human_factors_associated_with_ignition, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(structure_type==null?"null":structure_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(structure_status==null?"null":structure_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floor_of_fire_origin==null?"null":floor_of_fire_origin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fire_spread==null?"null":fire_spread, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no_flame_spread==null?"null":no_flame_spread, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_minimum_damage==null?"null":number_of_floors_with_minimum_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_significant_damage==null?"null":number_of_floors_with_significant_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_heavy_damage==null?"null":number_of_floors_with_heavy_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_extreme_damage==null?"null":number_of_floors_with_extreme_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detectors_present==null?"null":detectors_present, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_type==null?"null":detector_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_operation==null?"null":detector_operation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_effectiveness==null?"null":detector_effectiveness, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_failure_reason==null?"null":detector_failure_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_system_present==null?"null":automatic_extinguishing_system_present, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_sytem_type==null?"null":automatic_extinguishing_sytem_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_sytem_perfomance==null?"null":automatic_extinguishing_sytem_perfomance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_sytem_failure_reason==null?"null":automatic_extinguishing_sytem_failure_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_sprinkler_heads_operating==null?"null":number_of_sprinkler_heads_operating.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supervisor_district==null?"null":supervisor_district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighborhood_district==null?"null":neighborhood_district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(point==null?"null":point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_as_of==null?"null":data_as_of, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_loaded_at==null?"null":data_loaded_at, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(incident_number==null?"null":incident_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(exposure_number==null?"null":exposure_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(incident_date==null?"null":incident_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(call_number==null?"null":call_number.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(alarm_dttm==null?"null":alarm_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arrival_dttm==null?"null":arrival_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close_dttm==null?"null":close_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(battalion==null?"null":battalion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(station_area==null?"null":station_area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(box==null?"null":box, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(suppression_units==null?"null":suppression_units.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(suppression_personnel==null?"null":suppression_personnel.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ems_units==null?"null":ems_units.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ems_personnel==null?"null":ems_personnel.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_units==null?"null":other_units.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_personnel==null?"null":other_personnel.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(first_unit_on_scene==null?"null":first_unit_on_scene, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estimated_property_loss==null?"null":estimated_property_loss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estimated_contents_loss==null?"null":estimated_contents_loss.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fire_fatalities==null?"null":fire_fatalities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fire_injuries==null?"null":fire_injuries.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(civilian_fatalities==null?"null":civilian_fatalities.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(civilian_injuries==null?"null":civilian_injuries.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_alarms==null?"null":number_of_alarms.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(primary_situation==null?"null":primary_situation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mutual_aid==null?"null":mutual_aid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(action_taken_primary==null?"null":action_taken_primary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(action_taken_secondary==null?"null":action_taken_secondary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(action_taken_other==null?"null":action_taken_other, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_alerted_occupants==null?"null":detector_alerted_occupants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property_use==null?"null":property_use, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area_of_fire_origin==null?"null":area_of_fire_origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ignition_cause==null?"null":ignition_cause, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ignition_factor_primary==null?"null":ignition_factor_primary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ignition_factor_secondary==null?"null":ignition_factor_secondary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(heat_source==null?"null":heat_source, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(item_first_ignited==null?"null":item_first_ignited, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(human_factors_associated_with_ignition==null?"null":human_factors_associated_with_ignition, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(structure_type==null?"null":structure_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(structure_status==null?"null":structure_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floor_of_fire_origin==null?"null":floor_of_fire_origin.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fire_spread==null?"null":fire_spread, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no_flame_spread==null?"null":no_flame_spread, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_minimum_damage==null?"null":number_of_floors_with_minimum_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_significant_damage==null?"null":number_of_floors_with_significant_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_heavy_damage==null?"null":number_of_floors_with_heavy_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_floors_with_extreme_damage==null?"null":number_of_floors_with_extreme_damage.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detectors_present==null?"null":detectors_present, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_type==null?"null":detector_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_operation==null?"null":detector_operation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_effectiveness==null?"null":detector_effectiveness, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(detector_failure_reason==null?"null":detector_failure_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_system_present==null?"null":automatic_extinguishing_system_present, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_sytem_type==null?"null":automatic_extinguishing_sytem_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_sytem_perfomance==null?"null":automatic_extinguishing_sytem_perfomance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(automatic_extinguishing_sytem_failure_reason==null?"null":automatic_extinguishing_sytem_failure_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_sprinkler_heads_operating==null?"null":number_of_sprinkler_heads_operating.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(supervisor_district==null?"null":supervisor_district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighborhood_district==null?"null":neighborhood_district, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(point==null?"null":point, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_as_of==null?"null":data_as_of, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(data_loaded_at==null?"null":data_loaded_at, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_number = null; } else {
      this.incident_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.exposure_number = null; } else {
      this.exposure_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_date = null; } else {
      this.incident_date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.call_number = null; } else {
      this.call_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.alarm_dttm = null; } else {
      this.alarm_dttm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.arrival_dttm = null; } else {
      this.arrival_dttm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.close_dttm = null; } else {
      this.close_dttm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.battalion = null; } else {
      this.battalion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.station_area = null; } else {
      this.station_area = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.box = null; } else {
      this.box = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.suppression_units = null; } else {
      this.suppression_units = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.suppression_personnel = null; } else {
      this.suppression_personnel = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ems_units = null; } else {
      this.ems_units = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ems_personnel = null; } else {
      this.ems_personnel = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_units = null; } else {
      this.other_units = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_personnel = null; } else {
      this.other_personnel = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.first_unit_on_scene = null; } else {
      this.first_unit_on_scene = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estimated_property_loss = null; } else {
      this.estimated_property_loss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estimated_contents_loss = null; } else {
      this.estimated_contents_loss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fire_fatalities = null; } else {
      this.fire_fatalities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fire_injuries = null; } else {
      this.fire_injuries = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.civilian_fatalities = null; } else {
      this.civilian_fatalities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.civilian_injuries = null; } else {
      this.civilian_injuries = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_alarms = null; } else {
      this.number_of_alarms = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.primary_situation = null; } else {
      this.primary_situation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mutual_aid = null; } else {
      this.mutual_aid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.action_taken_primary = null; } else {
      this.action_taken_primary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.action_taken_secondary = null; } else {
      this.action_taken_secondary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.action_taken_other = null; } else {
      this.action_taken_other = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_alerted_occupants = null; } else {
      this.detector_alerted_occupants = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property_use = null; } else {
      this.property_use = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.area_of_fire_origin = null; } else {
      this.area_of_fire_origin = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ignition_cause = null; } else {
      this.ignition_cause = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ignition_factor_primary = null; } else {
      this.ignition_factor_primary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ignition_factor_secondary = null; } else {
      this.ignition_factor_secondary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.heat_source = null; } else {
      this.heat_source = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.item_first_ignited = null; } else {
      this.item_first_ignited = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.human_factors_associated_with_ignition = null; } else {
      this.human_factors_associated_with_ignition = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.structure_type = null; } else {
      this.structure_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.structure_status = null; } else {
      this.structure_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floor_of_fire_origin = null; } else {
      this.floor_of_fire_origin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fire_spread = null; } else {
      this.fire_spread = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.no_flame_spread = null; } else {
      this.no_flame_spread = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_minimum_damage = null; } else {
      this.number_of_floors_with_minimum_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_significant_damage = null; } else {
      this.number_of_floors_with_significant_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_heavy_damage = null; } else {
      this.number_of_floors_with_heavy_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_extreme_damage = null; } else {
      this.number_of_floors_with_extreme_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detectors_present = null; } else {
      this.detectors_present = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_type = null; } else {
      this.detector_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_operation = null; } else {
      this.detector_operation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_effectiveness = null; } else {
      this.detector_effectiveness = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_failure_reason = null; } else {
      this.detector_failure_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_system_present = null; } else {
      this.automatic_extinguishing_system_present = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_sytem_type = null; } else {
      this.automatic_extinguishing_sytem_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_sytem_perfomance = null; } else {
      this.automatic_extinguishing_sytem_perfomance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_sytem_failure_reason = null; } else {
      this.automatic_extinguishing_sytem_failure_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_sprinkler_heads_operating = null; } else {
      this.number_of_sprinkler_heads_operating = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.supervisor_district = null; } else {
      this.supervisor_district = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighborhood_district = null; } else {
      this.neighborhood_district = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.point = null; } else {
      this.point = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.data_as_of = null; } else {
      this.data_as_of = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.data_loaded_at = null; } else {
      this.data_loaded_at = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.incident_number = null; } else {
      this.incident_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.exposure_number = null; } else {
      this.exposure_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.incident_date = null; } else {
      this.incident_date = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.call_number = null; } else {
      this.call_number = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.alarm_dttm = null; } else {
      this.alarm_dttm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.arrival_dttm = null; } else {
      this.arrival_dttm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.close_dttm = null; } else {
      this.close_dttm = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.battalion = null; } else {
      this.battalion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.station_area = null; } else {
      this.station_area = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.box = null; } else {
      this.box = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.suppression_units = null; } else {
      this.suppression_units = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.suppression_personnel = null; } else {
      this.suppression_personnel = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ems_units = null; } else {
      this.ems_units = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ems_personnel = null; } else {
      this.ems_personnel = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_units = null; } else {
      this.other_units = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.other_personnel = null; } else {
      this.other_personnel = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.first_unit_on_scene = null; } else {
      this.first_unit_on_scene = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estimated_property_loss = null; } else {
      this.estimated_property_loss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estimated_contents_loss = null; } else {
      this.estimated_contents_loss = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fire_fatalities = null; } else {
      this.fire_fatalities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fire_injuries = null; } else {
      this.fire_injuries = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.civilian_fatalities = null; } else {
      this.civilian_fatalities = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.civilian_injuries = null; } else {
      this.civilian_injuries = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_alarms = null; } else {
      this.number_of_alarms = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.primary_situation = null; } else {
      this.primary_situation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mutual_aid = null; } else {
      this.mutual_aid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.action_taken_primary = null; } else {
      this.action_taken_primary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.action_taken_secondary = null; } else {
      this.action_taken_secondary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.action_taken_other = null; } else {
      this.action_taken_other = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_alerted_occupants = null; } else {
      this.detector_alerted_occupants = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property_use = null; } else {
      this.property_use = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.area_of_fire_origin = null; } else {
      this.area_of_fire_origin = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ignition_cause = null; } else {
      this.ignition_cause = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ignition_factor_primary = null; } else {
      this.ignition_factor_primary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ignition_factor_secondary = null; } else {
      this.ignition_factor_secondary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.heat_source = null; } else {
      this.heat_source = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.item_first_ignited = null; } else {
      this.item_first_ignited = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.human_factors_associated_with_ignition = null; } else {
      this.human_factors_associated_with_ignition = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.structure_type = null; } else {
      this.structure_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.structure_status = null; } else {
      this.structure_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floor_of_fire_origin = null; } else {
      this.floor_of_fire_origin = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fire_spread = null; } else {
      this.fire_spread = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.no_flame_spread = null; } else {
      this.no_flame_spread = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_minimum_damage = null; } else {
      this.number_of_floors_with_minimum_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_significant_damage = null; } else {
      this.number_of_floors_with_significant_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_heavy_damage = null; } else {
      this.number_of_floors_with_heavy_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_floors_with_extreme_damage = null; } else {
      this.number_of_floors_with_extreme_damage = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detectors_present = null; } else {
      this.detectors_present = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_type = null; } else {
      this.detector_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_operation = null; } else {
      this.detector_operation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_effectiveness = null; } else {
      this.detector_effectiveness = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.detector_failure_reason = null; } else {
      this.detector_failure_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_system_present = null; } else {
      this.automatic_extinguishing_system_present = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_sytem_type = null; } else {
      this.automatic_extinguishing_sytem_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_sytem_perfomance = null; } else {
      this.automatic_extinguishing_sytem_perfomance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.automatic_extinguishing_sytem_failure_reason = null; } else {
      this.automatic_extinguishing_sytem_failure_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_sprinkler_heads_operating = null; } else {
      this.number_of_sprinkler_heads_operating = new java.math.BigDecimal(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.supervisor_district = null; } else {
      this.supervisor_district = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighborhood_district = null; } else {
      this.neighborhood_district = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.point = null; } else {
      this.point = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.data_as_of = null; } else {
      this.data_as_of = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.data_loaded_at = null; } else {
      this.data_loaded_at = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    incidents o = (incidents) super.clone();
    return o;
  }

  public void clone0(incidents o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("incident_number", this.incident_number);
    __sqoop$field_map.put("exposure_number", this.exposure_number);
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("incident_date", this.incident_date);
    __sqoop$field_map.put("call_number", this.call_number);
    __sqoop$field_map.put("alarm_dttm", this.alarm_dttm);
    __sqoop$field_map.put("arrival_dttm", this.arrival_dttm);
    __sqoop$field_map.put("close_dttm", this.close_dttm);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("battalion", this.battalion);
    __sqoop$field_map.put("station_area", this.station_area);
    __sqoop$field_map.put("box", this.box);
    __sqoop$field_map.put("suppression_units", this.suppression_units);
    __sqoop$field_map.put("suppression_personnel", this.suppression_personnel);
    __sqoop$field_map.put("ems_units", this.ems_units);
    __sqoop$field_map.put("ems_personnel", this.ems_personnel);
    __sqoop$field_map.put("other_units", this.other_units);
    __sqoop$field_map.put("other_personnel", this.other_personnel);
    __sqoop$field_map.put("first_unit_on_scene", this.first_unit_on_scene);
    __sqoop$field_map.put("estimated_property_loss", this.estimated_property_loss);
    __sqoop$field_map.put("estimated_contents_loss", this.estimated_contents_loss);
    __sqoop$field_map.put("fire_fatalities", this.fire_fatalities);
    __sqoop$field_map.put("fire_injuries", this.fire_injuries);
    __sqoop$field_map.put("civilian_fatalities", this.civilian_fatalities);
    __sqoop$field_map.put("civilian_injuries", this.civilian_injuries);
    __sqoop$field_map.put("number_of_alarms", this.number_of_alarms);
    __sqoop$field_map.put("primary_situation", this.primary_situation);
    __sqoop$field_map.put("mutual_aid", this.mutual_aid);
    __sqoop$field_map.put("action_taken_primary", this.action_taken_primary);
    __sqoop$field_map.put("action_taken_secondary", this.action_taken_secondary);
    __sqoop$field_map.put("action_taken_other", this.action_taken_other);
    __sqoop$field_map.put("detector_alerted_occupants", this.detector_alerted_occupants);
    __sqoop$field_map.put("property_use", this.property_use);
    __sqoop$field_map.put("area_of_fire_origin", this.area_of_fire_origin);
    __sqoop$field_map.put("ignition_cause", this.ignition_cause);
    __sqoop$field_map.put("ignition_factor_primary", this.ignition_factor_primary);
    __sqoop$field_map.put("ignition_factor_secondary", this.ignition_factor_secondary);
    __sqoop$field_map.put("heat_source", this.heat_source);
    __sqoop$field_map.put("item_first_ignited", this.item_first_ignited);
    __sqoop$field_map.put("human_factors_associated_with_ignition", this.human_factors_associated_with_ignition);
    __sqoop$field_map.put("structure_type", this.structure_type);
    __sqoop$field_map.put("structure_status", this.structure_status);
    __sqoop$field_map.put("floor_of_fire_origin", this.floor_of_fire_origin);
    __sqoop$field_map.put("fire_spread", this.fire_spread);
    __sqoop$field_map.put("no_flame_spread", this.no_flame_spread);
    __sqoop$field_map.put("number_of_floors_with_minimum_damage", this.number_of_floors_with_minimum_damage);
    __sqoop$field_map.put("number_of_floors_with_significant_damage", this.number_of_floors_with_significant_damage);
    __sqoop$field_map.put("number_of_floors_with_heavy_damage", this.number_of_floors_with_heavy_damage);
    __sqoop$field_map.put("number_of_floors_with_extreme_damage", this.number_of_floors_with_extreme_damage);
    __sqoop$field_map.put("detectors_present", this.detectors_present);
    __sqoop$field_map.put("detector_type", this.detector_type);
    __sqoop$field_map.put("detector_operation", this.detector_operation);
    __sqoop$field_map.put("detector_effectiveness", this.detector_effectiveness);
    __sqoop$field_map.put("detector_failure_reason", this.detector_failure_reason);
    __sqoop$field_map.put("automatic_extinguishing_system_present", this.automatic_extinguishing_system_present);
    __sqoop$field_map.put("automatic_extinguishing_sytem_type", this.automatic_extinguishing_sytem_type);
    __sqoop$field_map.put("automatic_extinguishing_sytem_perfomance", this.automatic_extinguishing_sytem_perfomance);
    __sqoop$field_map.put("automatic_extinguishing_sytem_failure_reason", this.automatic_extinguishing_sytem_failure_reason);
    __sqoop$field_map.put("number_of_sprinkler_heads_operating", this.number_of_sprinkler_heads_operating);
    __sqoop$field_map.put("supervisor_district", this.supervisor_district);
    __sqoop$field_map.put("neighborhood_district", this.neighborhood_district);
    __sqoop$field_map.put("point", this.point);
    __sqoop$field_map.put("data_as_of", this.data_as_of);
    __sqoop$field_map.put("data_loaded_at", this.data_loaded_at);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("incident_number", this.incident_number);
    __sqoop$field_map.put("exposure_number", this.exposure_number);
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("incident_date", this.incident_date);
    __sqoop$field_map.put("call_number", this.call_number);
    __sqoop$field_map.put("alarm_dttm", this.alarm_dttm);
    __sqoop$field_map.put("arrival_dttm", this.arrival_dttm);
    __sqoop$field_map.put("close_dttm", this.close_dttm);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("battalion", this.battalion);
    __sqoop$field_map.put("station_area", this.station_area);
    __sqoop$field_map.put("box", this.box);
    __sqoop$field_map.put("suppression_units", this.suppression_units);
    __sqoop$field_map.put("suppression_personnel", this.suppression_personnel);
    __sqoop$field_map.put("ems_units", this.ems_units);
    __sqoop$field_map.put("ems_personnel", this.ems_personnel);
    __sqoop$field_map.put("other_units", this.other_units);
    __sqoop$field_map.put("other_personnel", this.other_personnel);
    __sqoop$field_map.put("first_unit_on_scene", this.first_unit_on_scene);
    __sqoop$field_map.put("estimated_property_loss", this.estimated_property_loss);
    __sqoop$field_map.put("estimated_contents_loss", this.estimated_contents_loss);
    __sqoop$field_map.put("fire_fatalities", this.fire_fatalities);
    __sqoop$field_map.put("fire_injuries", this.fire_injuries);
    __sqoop$field_map.put("civilian_fatalities", this.civilian_fatalities);
    __sqoop$field_map.put("civilian_injuries", this.civilian_injuries);
    __sqoop$field_map.put("number_of_alarms", this.number_of_alarms);
    __sqoop$field_map.put("primary_situation", this.primary_situation);
    __sqoop$field_map.put("mutual_aid", this.mutual_aid);
    __sqoop$field_map.put("action_taken_primary", this.action_taken_primary);
    __sqoop$field_map.put("action_taken_secondary", this.action_taken_secondary);
    __sqoop$field_map.put("action_taken_other", this.action_taken_other);
    __sqoop$field_map.put("detector_alerted_occupants", this.detector_alerted_occupants);
    __sqoop$field_map.put("property_use", this.property_use);
    __sqoop$field_map.put("area_of_fire_origin", this.area_of_fire_origin);
    __sqoop$field_map.put("ignition_cause", this.ignition_cause);
    __sqoop$field_map.put("ignition_factor_primary", this.ignition_factor_primary);
    __sqoop$field_map.put("ignition_factor_secondary", this.ignition_factor_secondary);
    __sqoop$field_map.put("heat_source", this.heat_source);
    __sqoop$field_map.put("item_first_ignited", this.item_first_ignited);
    __sqoop$field_map.put("human_factors_associated_with_ignition", this.human_factors_associated_with_ignition);
    __sqoop$field_map.put("structure_type", this.structure_type);
    __sqoop$field_map.put("structure_status", this.structure_status);
    __sqoop$field_map.put("floor_of_fire_origin", this.floor_of_fire_origin);
    __sqoop$field_map.put("fire_spread", this.fire_spread);
    __sqoop$field_map.put("no_flame_spread", this.no_flame_spread);
    __sqoop$field_map.put("number_of_floors_with_minimum_damage", this.number_of_floors_with_minimum_damage);
    __sqoop$field_map.put("number_of_floors_with_significant_damage", this.number_of_floors_with_significant_damage);
    __sqoop$field_map.put("number_of_floors_with_heavy_damage", this.number_of_floors_with_heavy_damage);
    __sqoop$field_map.put("number_of_floors_with_extreme_damage", this.number_of_floors_with_extreme_damage);
    __sqoop$field_map.put("detectors_present", this.detectors_present);
    __sqoop$field_map.put("detector_type", this.detector_type);
    __sqoop$field_map.put("detector_operation", this.detector_operation);
    __sqoop$field_map.put("detector_effectiveness", this.detector_effectiveness);
    __sqoop$field_map.put("detector_failure_reason", this.detector_failure_reason);
    __sqoop$field_map.put("automatic_extinguishing_system_present", this.automatic_extinguishing_system_present);
    __sqoop$field_map.put("automatic_extinguishing_sytem_type", this.automatic_extinguishing_sytem_type);
    __sqoop$field_map.put("automatic_extinguishing_sytem_perfomance", this.automatic_extinguishing_sytem_perfomance);
    __sqoop$field_map.put("automatic_extinguishing_sytem_failure_reason", this.automatic_extinguishing_sytem_failure_reason);
    __sqoop$field_map.put("number_of_sprinkler_heads_operating", this.number_of_sprinkler_heads_operating);
    __sqoop$field_map.put("supervisor_district", this.supervisor_district);
    __sqoop$field_map.put("neighborhood_district", this.neighborhood_district);
    __sqoop$field_map.put("point", this.point);
    __sqoop$field_map.put("data_as_of", this.data_as_of);
    __sqoop$field_map.put("data_loaded_at", this.data_loaded_at);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
