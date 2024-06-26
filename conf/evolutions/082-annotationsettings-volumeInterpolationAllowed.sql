START TRANSACTION;

DROP VIEW webknossos.taskTypes_;
ALTER TABLE webknossos.taskTypes ADD COLUMN settings_volumeInterpolationAllowed BOOLEAN NOT NULL DEFAULT false;

CREATE VIEW webknossos.taskTypes_ AS SELECT * FROM webknossos.taskTypes WHERE NOT isDeleted;

UPDATE webknossos.releaseInformation SET schemaVersion = 82;

COMMIT TRANSACTION;
