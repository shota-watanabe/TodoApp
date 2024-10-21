-- 起動時に本ファイルのSQLが読み込まれる
CREATE TABLE tasks
(
  id BIGINT NOT NULL PRIMARY KEY  AUTO_INCREMENT,
  summary VARCHAR(256) NOT NULL,
  description TEXT,
  status VARCHAR NOT NULL
);
